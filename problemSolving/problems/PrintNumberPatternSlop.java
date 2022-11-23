package problems;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumberPatternSlop {
	Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    	PrintNumberPatternSlop pattern=new PrintNumberPatternSlop();
    	pattern.printPattern();
    	
    }
   
    public void printPattern() {
    	System.out.println("Enetr the number");
    	int given=scanner.nextInt();
    	int count=1;
    	int number=((given*given)+given)/2;
    	int startrow=0; 
    	int endrow=given-1;
    	int startCol=0;
    	int endcol=given-1;
    	int start=0;
    	int end=0;
    	int [][] arr=new int[given][given];
    	while(count<=number) {
    		for(int i=startCol; i<=endcol; i++) {
    			arr[start++][i]=count++;
    		}
    		
    		endrow--;
    		startCol++;
    		for(int j=endrow; j>=startrow; j--) {
    			arr[j][endcol]=count++;
    		}
    		
    		endcol--;
    		endrow--;
    		for(int k=endcol; k>=startCol; k--) {
    			arr[startrow][k]=count++;
    		}
    		      
    		startCol++;
    		startrow++;
    		start=startrow;
    	
    	}
    	System.out.println(Arrays.deepToString(arr));
    	
    	 for(int i=0; i<given; i++) {
    		
    	    	for(int j=0; j<given; j++) {
    	    		if(arr[i][j]!=0) {
    	    			
    	    		System.out.print(arr[i][j]+" ");
    	    			}
    	    		
    	    		else {
    	    			System.out.print("   ");
    	    		}
    	    		}
    	    	
    	    	System.out.println();
    	    }
    }
   


}