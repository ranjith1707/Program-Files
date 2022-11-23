package problems;

import java.util.Arrays;
import java.util.Scanner;

public class SpirelPattern {
	public static void main(String[] args) {
		SpirelPattern p=new SpirelPattern();
		p.spring();
	}

	private void spring() {

		System.out.println("Enter the Count ");
		Scanner scanner = new Scanner(System.in);
		int given = scanner.nextInt();
		int[][] arr = new int[given][given];
		int index = 0;
		int number = 1;
		int position = 0;
		int order = 1;
		int forword=0; 
		int revers=given-1;
		for (int i = 1; i <= given; i++) {
			forword=0; 
			
				for (int j = 0; j <= given - i; j++) {
					if (i % 2 != 0) {
						
						if (order == 1) {
							arr[position][forword++] = number++;
                            if(j==given-i) {
                            	order=2;
                            }
						}
						else {
							arr[position][index] = number++;
                            index++;
						}

					} 
					else {
						if (order == 1) {
							position++;
						}
							arr[position][index] = number++;
                            index++;
						
						
					}
						
					}
				if(order==1) {
					
					order=2;
				}
				
				index=0;
				

			
				
		}
		System.out.println(Arrays.deepToString(arr));
	}
}