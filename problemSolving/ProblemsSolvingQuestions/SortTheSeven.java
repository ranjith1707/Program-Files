package problems;
import java.util.*;
public class SortTheSeven {
   public static void main(String[] args) {
	   SortTheSeven sort=new SortTheSeven();
	   sort.sorting();
   }
   
   private void sorting() {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("ENetr the ength of Array");
	  List<Integer> list=new ArrayList<Integer>();
	   int size=scanner.nextInt();
	   int given;
	   int count=0;
	   for(int i=0; i<size; i++) {
		   given=scanner.nextInt();
		   if(given==7) {
			   count++;
		   } 
		   else {
			   list.add(given);
		   }
	   }
	   while(count!=0) {
		   list.add(7);
		   count--;
	   }
	   System.out.println(list);
   }
}
