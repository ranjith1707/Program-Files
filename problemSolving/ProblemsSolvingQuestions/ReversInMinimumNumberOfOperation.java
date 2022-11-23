package problems;
import java.util.*;
public class ReversInMinimumNumberOfOperation {
	public static void main (String[] args) throws java.lang.Exception
	{
		ReversInMinimumNumberOfOperation operation=new ReversInMinimumNumberOfOperation();
		operation.reverse();
	}
	private void reverse() {
		
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enetr the String");
           String s=scanner.nextLine();
           int siz=s.length();
         int index=0;
           for(int j=0; j<s.length();j++){
              if(s.charAt(siz-1-index)==s.charAt(j)){
                  index++;
              }
           }
           System.out.println(s.length()-index);
       scanner.close();
	}
}
