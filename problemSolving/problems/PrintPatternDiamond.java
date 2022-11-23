package problems;

import java.util.Scanner;

public class PrintPatternDiamond {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		PrintPatternDiamond pattern = new PrintPatternDiamond();

		pattern.method();
	}

	private void method() {
		System.out.println("Enetr The String ");
		String str = scanner.nextLine();
		if (str.length() % 2 != 0) {
			char[] ch = str.toCharArray();
			int size = ch.length / 2;
			int position = size;
			int findex = 0;
			int sIndex = 0;

			for (int i = 0; i < size + 1; i++) {

				for (int j = 0; j < ch.length; j++) {

					if (j == position + findex) {
						System.out.print(ch[j]);
					} else if (j == position + sIndex) {
						System.out.print(ch[j]);
					} else {
						System.out.print(" ");
					}
				}
				findex--;
				sIndex++;
				System.out.println();

			}
			findex += 2;
			sIndex -= 2;
			for (int i = 0; i < size; i++) {

				for (int j = 0; j < ch.length; j++) {

					if (j == position + findex) {
						System.out.print(ch[j]);
					} else if (j == position + sIndex) {
						System.out.print(ch[j]);
					} else {
						System.out.print(" ");
					}
				}
				findex++;
				sIndex--;
				System.out.println();

			}
		} else {
			System.out.println("Not Posible");
		}
	}
}
