package exceptionsInJava;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scaner = null;
		try {
			scaner = new Scanner(System.in);

			int[] i = { 1, 2, 3 };
			int number = i[10];

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
			System.out.println("Before Scanner Close");
			
			if(scaner!=null) {
			scaner.close();
			
		}

		System.out.println("After scanner close");

	}

	}
}
