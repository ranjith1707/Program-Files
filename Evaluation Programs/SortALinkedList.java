package evaluation;

import java.util.*;

public class SortALinkedList {
	public static void main(String[] args) {
		SortALinkedList sortList = new SortALinkedList();
		sortList.sortAList();
	}

	private void sortAList() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Lenth");
		int size = scanner.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(scanner.nextInt());
		int number;
		for (int i = 0; i < size - 1; i++) {
			number = scanner.nextInt();
			int temp = list.get(i);
			int max = Collections.max(list);
			int min = Collections.min(list);
			if (max <= number) {
				list.addLast(number);
			}

			else if (number <= min) {
				list.addFirst(number);
			} else {
				int previousNumber = list.get(i);
				list.set(list.indexOf(max), number);
				list.add(previousNumber);
			}

		}
		System.out.println(list);
	}

}
