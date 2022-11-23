package problems;
import java.util.*;
public class FindFirstOccurs {
   public static void main(String[] args) {
	   FindFirstOccurs Occurrance=new FindFirstOccurs();
	   Occurrance.findFirstOccurs();
   }
    private void findFirstOccurs() {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Eneter ArrayLength");
	      int siz=scanner.nextInt();
	      ArrayList<Integer> list=new ArrayList<Integer>();
	      for(int i=0; i<siz; i++) {
	    	  list.add(scanner.nextInt());
	      }
	      int min=siz;
	      for(int i=0; i<siz; i++) {
	    	 
	    	  if(list.lastIndexOf(list.get(i))!=i) {
	    		 min=Math.min(min, list.lastIndexOf(list.get(i)));
	    	  }
	      }
	      System.out.println(list.get(min));
   }
}
