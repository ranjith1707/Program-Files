package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class PushPopValidation {
	public static void main(String[] args) {
		PushPopValidation valid = new PushPopValidation();
		valid.method();
	}

	private void method() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			System.out.println("Length Of Arraylist ");
			int len = scanner.nextInt();
			for (int j = 0; j < len; j++) {
				System.out.println("Enetr Number :");
				int number = scanner.nextInt();
				if (i == 0)
					arr1.add(number);
				else
					arr2.add(number);
			}
		}
		if(arr1.size()!=arr2.size()) {
			System.out.println("false");
			return;
		}
		int length = 0;
		t: for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; arr1.size() != 0; j++) {
				if (arr2.get(0) == arr1.get(length)) {
					arr2.remove(0);
					arr1.remove(length);
					if (length != 0)
						length--;
				} else
					length++;

				if (length == arr1.size() && arr1.size() != 0) {
					System.out.println("False");
					break t;
				}
			}
		}
		if (arr1.size() == 0) {
			System.out.println("True");
		}
	}
}