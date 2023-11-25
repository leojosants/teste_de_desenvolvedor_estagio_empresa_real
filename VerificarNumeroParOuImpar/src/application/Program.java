/*
 * 	Escreva uma função para retornar se um número é par ou ímpar (na sua linguagem de preferência).
 * 	Apresente 3 exemplos de chamada da função e seu retorno esperado.
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
			converted = "ÍMPAR";
		}

		return converted;
	}

	private static void displayResult(int number, String result) {
		System.out.println("\n---------- Exibindo resultado ----------");
		System.out.printf(" - Número gerado ............: %d%n", number);
		System.out.printf(" - O número é PAR ou ÍMPAR ..: %s%n%n", result);
	}
}
