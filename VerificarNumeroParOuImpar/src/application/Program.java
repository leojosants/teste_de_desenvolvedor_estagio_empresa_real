/*
 * 	Escreva uma fun��o para retornar se um n�mero � par ou �mpar (na sua linguagem de prefer�ncia).
 * 	Apresente 3 exemplos de chamada da fun��o e seu retorno esperado.
 */

package application;

public class Program {
	public static void main(String[] args) {

		int number = generateRandomNumber();

		boolean isEven = checkNumber(number);

		String result = convertBooleanToString(isEven);

		displayResult(number, result);

		System.out.println("-> fim do programa");
	}

	/*
	 * functions section
	 */
	private static int generateRandomNumber() {
		int number = (int) (Math.random() * 1000);
		return number;
	}

	private static boolean checkNumber(int number) {
		boolean isEven = false;

		if ((number % 2) == 0) {
			isEven = true;
			return isEven;
		}

		return isEven;
	}

	private static String convertBooleanToString(boolean isEven) {
		String converted = "";

		if (isEven) {
			converted = "PAR";
		} else {
			converted = "�MPAR";
		}

		return converted;
	}

	private static void displayResult(int number, String result) {
		System.out.println("\n---------- Exibindo resultado ----------");
		System.out.printf(" - N�mero gerado ............: %d%n", number);
		System.out.printf(" - O n�mero � PAR ou �MPAR ..: %s%n%n", result);
	}
}
