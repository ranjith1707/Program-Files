package problems;

import java.util.Scanner;
import java.util.*;

public class TaskSortFrequancy {
	public static void main(String[] args) {
		TaskSortFrequancy sort = new TaskSortFrequancy();
		sort.sorting();
	}

	private void sorting() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter The length of an Array");
		int size = scanner.nextInt();
		for (int j = 0; j < size; j++) {
			list.add(scanner.nextInt());
		}

		Set<Integer> set = new TreeSet<Integer>(list);
		List<Integer> out = new ArrayList<Integer>();

		int max = 0;
		int num = 0;

		while (set.size() != 0) {
			max = 0;
			for (Integer number : set) {
				int fre = Collections.frequency(list, number);
				if (max < fre) {
					max = fre;
					num = number;
				}

			}
			for (int i = 0; i < max; i++) {
				out.add(num);
			}
			set.remove(num);
		}
		System.out.println(out);
	}
}
