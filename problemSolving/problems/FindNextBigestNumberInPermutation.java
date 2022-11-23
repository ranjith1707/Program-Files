package problems;

import java.util.Scanner;

public class FindNextBigestNumberInPermutation {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		FindNextBigestNumberInPermutation find = new FindNextBigestNumberInPermutation();
		find.findTheNumber();
	}

	private void findTheNumber() {
		System.out.println("Enter the Number ");
		String number = scanner.nextLine();
		char[] arr = number.toCharArray();

		int index = arr.length - 2;
		boolean flag = false;

		System.out.println(arr);
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[index] < arr[arr.length - 1]) {

				flag = true;
				break;
			}
			index--;

		}

		if (flag) {
			char temp = arr[arr.length - 1];
			arr[arr.length - 1] = arr[index];
			arr[index] = temp;

			int len = (arr.length - 1) - index;
			int neg = 0;

			for (int i = 1; i < len; i++) {
				for (int j = index + 1; j < arr.length - 1; j++) {

					if (arr[j] > arr[j + 1]) {
						char num = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = num;
					}
				}
			}
		}
		System.out.println(arr);
	}
}
