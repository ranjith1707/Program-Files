package problems;
  import java.util.Arrays;
import java.util.Scanner;
public class ProdectOfAllElements {
   public static void main(String[] args) {
	   ProdectOfAllElements prodect=new ProdectOfAllElements();
	   prodect.podectOfElement();
   }
   
   
   private void podectOfElement() {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the length of an  Array");
	  
	  int lengthOfArray=scanner.nextInt();
	  int[] array=new int[lengthOfArray];
	  int[] prodects=new int[lengthOfArray];
	 
	  for(int i=0; i<lengthOfArray; i++) {
		  array[i]=scanner.nextInt();
	  }
	  int mul=1;
	  int index=0;
	  for(int i=0; i<lengthOfArray; i++) {
		  mul=1;
		  for(int j=0; j<lengthOfArray; j++) {
		  if(j!=index) {
			  mul*=array[j];
		  }
		  
	  }
		  prodects[i]=mul;
		  index++;
		 
	  }
	  System.out.println(Arrays.toString(prodects));
   }
}
