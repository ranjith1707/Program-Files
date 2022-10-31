package evaluation;

import java.util.*;

public class PrintThePattern {
	public static void main(String[] args) {
		PrintThePattern pattern = new PrintThePattern();
		pattern.printPattern();
	}

	private void printPattern() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr String");
		String str = scanner.nextLine();

		System.out.println("Enter Line ");
		int line = scanner.nextInt();

		String[] arr = new String[str.length() / 2];
		String st = "";
		int position = 0;
		int letter = 0;
		boolean flag = false;
		boolean letterflag = false;
		int letterposition;
		letterposition = line - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			st = "";
			letterflag = false;
			flag = false;

			for (int j = 0; j < line; j++) {

				if (i == letter && position < str.length()) {

					st += str.charAt(position++);
					flag = true;
					letterposition = line - 1;
				} else if (j == letterposition - 1 && position < str.length()) {
					st += str.charAt(position++);
					letterflag = true;
				} else {
					st += " ";
				}

			}
			arr[i] = st;
			if (flag) {
				letter += line - 1;
			}
			if (letterflag) {
				letterposition--;
			}

		}

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < str.length() / 2; j++) {
				System.out.print(arr[j].charAt(i));
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
