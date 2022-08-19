package exceptionsInJava;

import java.util.Scanner;

public class TryWithResourceRunner {

	public static void main(String[] args) {
		
		try(Scanner	scanner = new Scanner(System.in)){

			int[] numbers = { 1, 2, 3 };
			
			int number=numbers[20];
		}
		}

		
	}
	
