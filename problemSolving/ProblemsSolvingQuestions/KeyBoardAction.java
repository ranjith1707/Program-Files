package problems;

import java.util.Scanner;

public class KeyBoardAction {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		KeyBoardAction keyboard = new KeyBoardAction();
		keyboard.method();
	}

	private void method() {
		String[] value = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		System.out.println("Enetr the value");
		String given = scanner.nextLine();
		String[] num = given.split("-");
		int number=0;
		int count=0;
		boolean flag=false;
		if(given.charAt(0)=='#') {
			flag=true;
		}
		for (int i = 0; i < num.length; i++) {
			char[] ch = num[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (Character.isDigit(ch[j])) {
                        number=Character.getNumericValue(ch[j])-1;
                        count++;
				}
				
				
			}
			if(flag&&number-1<=value.length) {
				if(count-1<=value[number-1].length()-1) {
			        System.out.print(Character.toUpperCase(value[number-1].charAt(count-1)));
				}
			}else {
				if(number-1<=value.length)
				if(count-1<=value[number-1].length()-1)
				System.out.print(value[number-1].charAt(count-1));
			}
			count=0;
		}

	}
}
