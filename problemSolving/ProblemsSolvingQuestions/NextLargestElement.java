package problems;

import java.util.Arrays;
import java.util.Scanner;

public class NextLargestElement {
	public static void main(String[] args) {
		NextLargestElement nextLargest = new NextLargestElement();
		nextLargest.findNext();
	}

	private void findNext() {
		Scanner scanner = new Scanner(System.in);
		int lengthOfArray = scanner.nextInt();
		int[] array = new int[lengthOfArray];
		for (int i = 0; i < lengthOfArray; i++) {
			array[i] = scanner.nextInt();
		}
		int max;
		for (int i = 0; i < lengthOfArray; i++) {
			max = array[i];
			for (int j = i; j < lengthOfArray; j++) {
				if (i != j) {
					if (max < array[j]) {
						max = Math.max(max, array[j]);

					}

				}
			}
			if (max == array[i]) {
				array[i] = 0;
			} else {
				array[i] = max;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
