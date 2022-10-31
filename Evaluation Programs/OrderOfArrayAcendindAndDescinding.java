package evaluation;

import java.util.*;

public class OrderOfArrayAcendindAndDescinding {
	public static void main(String[] args) {
		OrderOfArrayAcendindAndDescinding arrayOrder = new OrderOfArrayAcendindAndDescinding();
		arrayOrder.arranging();
	}

	private void arranging() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr ArrayLength");
		int size = scanner.nextInt();
		int[] numberArray = new int[size];
		int max = 0;
		int min = 0;
		for (int i = 0; i < size; i++) {
			numberArray[i] = scanner.nextInt();
			min = Math.max(min, numberArray[i]);
		}
		int minIndex = 0;
		int maxIndex = 0;

		System.out.println(Arrays.toString(numberArray));
		for (int i = 0; i < size; i++) {

			max = -10;
			min = 100;
			for (int j = i; j < size; j++) {
				if (j % 2 == 0) {
					if (min > Math.min(min, numberArray[j])) {
						min = Math.min(min, numberArray[j]);
						minIndex = j;
					}
				} else if (j % 2 != 0) {
					if (max < Math.max(max, numberArray[j])) {
						max = Math.max(max, numberArray[j]);
						maxIndex = j;
					}
				}
			}
			if (i % 2 == 0) {
				int temp = numberArray[i];
				numberArray[i] = min;
				numberArray[minIndex] = temp;
			} else {
				int temp = numberArray[i];
				numberArray[i] = max;
				numberArray[maxIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(numberArray));
	}
}
