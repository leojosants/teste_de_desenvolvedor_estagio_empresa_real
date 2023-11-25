/*
 * 	Escreva em sua linguagem favorita uma forma de validar a seguinte demanda: Verificar se a palavra "ol�" est� contida na frase "ol� jo�o".
 * 	Apresente a chamada da fun��o e seu retorno esperado.
 */

package application;

public class Program {

	public static final String phrase = "ol� jo�o";
	public static final String wordToBeChecked = "ol�";

	public static void main(String[] args) {

		String[] vector = splitString();

		boolean exist = checkString(vector);
		
		String result = convertBooleanToString(exist);

		displayResult(result);

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions section
	 */
	private static String[] splitString() {
		String[] vector = phrase.split(" ");
		return vector;
	}

	private static boolean checkString(String[] vector) {
		boolean exist = false;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i].equals(wordToBeChecked)) {
				exist = true;
				return exist;
			}
		}

		return exist;
	}

	private static String convertBooleanToString(boolean exist) {
		String converted = "N�O EXISTE";

		if (exist) {
			converted = "EXISTE";
			return converted;
		} 

		return converted;
	}

	private static void displayResult(String result) {
		System.out.println("\n---------- Exibindo resultado ----------");
		System.out.printf("- Frase .....................: %s%n", phrase);
		System.out.printf("- Palavra a ser verificada ..: %s%n", wordToBeChecked);
		System.out.printf("- A palavra existe na frase..: %s%n", result);
	}
}
