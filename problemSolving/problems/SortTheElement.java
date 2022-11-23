package problems;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheElement {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SortTheElement f = new SortTheElement();
		f.sort();
	}

	private void sort() {
		System.out.println("Enter the Length of Array");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Before Sorting " + Arrays.toString(arr));
		int index = 0;
		int minIndex = 0;
		for (int i = 0; i < size; i++) {
			index = i;
			minIndex = i;
			int max = 0;
			int min = 100;
			for (int j = i; j < size; j++) {
				if (j % 2 == 0) {
					if (max < Math.max(max, arr[j])) {
						max = Math.max(max, arr[j]);
						index = j;
					}
				} else {
					if (min > Math.min(min, arr[j])) {
						min = Math.min(min, arr[j]);
						minIndex = j;
					}
				}
			}

			if (i % 2 == 0) {
				int temp = arr[i];
				arr[i] = max;
				arr[index] = temp;
			} else {
				int temp = arr[i];
				arr[i] = min;
				arr[minIndex] = temp;
			}
		}

		System.out.println("After" + Arrays.toString(arr));
	}
}
