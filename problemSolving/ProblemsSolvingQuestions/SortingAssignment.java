package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortingAssignment {
   public static void main(String[] args) {
	   SortingAssignment sort=new SortingAssignment();
	   sort.sorting();
   }
   
   private void sorting() {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the String ");
	   String given=scanner.nextLine();
	   List<String> list=new ArrayList<String>();
	   Collections.addAll(list, given.split(""));
	   Set<String> set=new HashSet(list);
	   for(String str:set) {
		   int fre=Collections.frequency(list, str);
		   System.out.print(str);
		   if(fre>1) {
			   System.out.print(fre);
		   }
	   }
   }
   
}
