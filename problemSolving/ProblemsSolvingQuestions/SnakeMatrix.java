package problems;

import java.util.Scanner;

public class SnakeMatrix {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SnakeMatrix matrix = new SnakeMatrix();
		matrix.method();
	}

	private void method() {
		System.out.println("Enetr the Number");
		float given = scanner.nextInt();
		int number = 0;
		int number2 = (int) (given * 2);
		int space = 0;
		for (int i = 0; i < Math.ceil(given / 2); i++) {
			for (int j = 0; j < given - space; j++) {
				System.out.print(" ");
			}
			space++;
			for (int k = 0; k < given; k++) {
				System.out.print(++number);
				System.out.print(" ");
			}

			System.out.println();
			for (int j = 0; j < given - space; j++) {
				System.out.print(" ");
			}
			number2 = (int) (number + given);
			number += given;
			space++;

			for (int k = 0; k < given; k++) {
				System.out.print(number2--);
				System.out.print(" ");
			}
			

			System.out.println();
		}

	}
}
