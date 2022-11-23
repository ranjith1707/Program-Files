package problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class RemovePalindrom {
	private Scanner scanner=new Scanner(System.in);
   public static void main(String[] args) {
	   RemovePalindrom g=new RemovePalindrom();
	   g.method();
   }
   
   private void method() {
	   System.out.println("Enetr the String ");
	   String given=scanner.nextLine();
	   ArrayList<String> list=new ArrayList<String>();
	   Collections.addAll(list,given.split(" "));
	   int size=list.size();
	   Iterator it=list.iterator();
	   while(it.hasNext()) {
		   String value=(String) it.next();
		   StringBuilder build=new StringBuilder(value);
		   build.reverse();
		   if(value.equals(build.toString())) {
			   it.remove();
		   }
	   }
	   
	   System.out.println(list);
   }
}
