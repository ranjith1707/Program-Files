package problems;

import java.util.*;

public class SingleLoopSorting {
	public static void main(String[] args) {
		SingleLoopSorting sort = new SingleLoopSorting();
		sort.method();
	}

	private void method() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Length of Array");
		int leng = scanner.nextInt();
		list.add(scanner.nextInt());
		int given;
		for (int i = 0; i < leng - 1; i++) {
			given = scanner.nextInt();
			if (given >= list.get(list.size() - 1)) {
				list.add(given);
			} else if (given <= list.get(0)) {
				list.addFirst(given);
			} else {

				list.add(list.indexOf(list.get(list.size() - 1)), given);
			}
		}
		System.out.println(list);

	}

}
