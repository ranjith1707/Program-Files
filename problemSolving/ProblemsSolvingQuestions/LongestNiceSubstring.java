package problems;

import java.util.Scanner;

public class LongestNiceSubstring {

	public static void main(String[] args) {
		LongestNiceSubstring neceString = new LongestNiceSubstring();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr String");
		System.out.println(neceString.method(scanner.nextLine()));

	}

	private String method(String s) {
		String str = s;
		int size = s.length();

		String output = "";
		String ch = "";
		if (size == 1) {
			return "";
		}
		String temp = "";
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j <= size; j++) {
				ch = str.substring(i, j);
				temp += ch.charAt(0);
				if (ch.contains(temp.toLowerCase()) && ch.contains(temp.toUpperCase())) {
					if (output.length() < ch.length()) {
						String[] st = ch.split("");
						for (String r : st) {
							if (r.equals(temp.toLowerCase()) || r.equals(temp.toUpperCase())) {
								flag = true;
							} else {
								flag = false;
								break;
							}
						}
						if (flag)
							output = ch;
					}
				}
				temp = "";
			}
		}
		return output;
	}
}
