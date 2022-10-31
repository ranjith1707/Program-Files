package evaluation;

import java.util.*;

public class DescendingOrderOfTheElement {
	public static void main(String[] args) {
		DescendingOrderOfTheElement order = new DescendingOrderOfTheElement();
		order.orderTheElement();
	}

	private void orderTheElement() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Array Length");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = scanner.nextInt();
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		Set<Integer> set = new HashSet(list);
		int max = 0;
		int val = list.get(0);
		while (set.size() != 0) {
			max = 0;

			for (Integer num : set) {
				int fre = Collections.frequency(list, num);
				if (max < fre) {
					max = fre;
					val = num;

				}
			}
			for (int j = 0; j < max; j++) {
				output.add(val);
			}
			set.remove(val);
		}
		System.out.println(output);

	}
}
