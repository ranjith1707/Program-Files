package problems;

import java.util.Scanner;

public class EncriptionGivenString {
	Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    	EncriptionGivenString c=new EncriptionGivenString();
    	c.encrpit();
    }
    
    private void encrpit() {
    	System.out.println("Enetr first String ");
    	String str1=scanner.nextLine();
    	System.out.println("Enetr Secount Strign ");
    	String str2=scanner.nextLine();
    	int size=str1.length();
    	
    	char[] charr=str1.toCharArray();
    	char[] charr2=str2.toCharArray();
  	
    	 int firstLetter;
    	 int secondLetter;
    	 int total;
        for(int i=0; i<size; i++) {
        	firstLetter=charr[i]-96;
        	 secondLetter=charr2[i]-96;
        	 total =(firstLetter+secondLetter);
        	 if(total>26) {
        		 total-=26;
        	 }
        	 char character= (char) (total+=96);
        	 System.out.print(character);
        }
    
    }
}
