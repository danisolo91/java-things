package Exceptions;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("Start");

		// Checked
		try {
			checkedException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Primera excepción capturada, continúa ejecución...");

		// Unchecked
		uncheckedException();

		System.out.println("Stop");
	}

	/**
	 * CHECKED EXCEPTIONS
	 * 
	 * Las excepciones de tipo Exception hay que comprobarlas, es decir, o bien se
	 * envuelven con try catch o bien se propaga con throws.
	 * 
	 * Example: IOException, ParseException, etc.
	 */
	private static void checkedException() throws Exception {
		throw new Exception("Checked exception");
	}

	/**
	 * Las excepciones RuntimeException no es obligatorio comprobarlas, pero si no
	 * se comprueban el programa se para cuando ocurre este tipo de excepción, por
	 * eso en este caso no se llega a imprimir "Stop".
	 * 
	 * Ex: NullPointerException, IndexOutOfBoundsException,
	 * IllegalArgumentException, etc.
	 */
	private static void uncheckedException() {
		throw new RuntimeException("Unchecked exception");
	}
}
