package exceptionsInJava;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		method1();

		System.out.println("Method1 is ended");

	}

	private static void method1() {
		method2();

		System.out.println("Method2 is ended");
	}

	private static void method2() {
		method3();
		System.out.println("Method3 is ended");
	}

	private static void method3() {
		try {
			String str = null;
			str.length();

			int[] a = { 1, 2, 3 };

			int number = a[4];

			System.out.println("Method4 is ended");
		} catch (NullPointerException ex) {

			System.out.println("Nullpointexception is matched");

			// to print the all the exceptions in the program
			ex.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException ex) {

			System.out.println("ArrayIndexException is matched");
			ex.printStackTrace();

		} catch (Exception ex) {
			System.out.println("Exception is matched");
			ex.printStackTrace();

		}

	}
}
