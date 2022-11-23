package problems;
import java.util.*;
public class EqualArray {
  public static void main(String[] args) {
	  EqualArray arrEqual=new EqualArray();
	  arrEqual.method();
  }
  private void method() {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter First Array Length ");
	  int len=scanner.nextInt();
	  int[] arr1=new int[len];
	  for(int i=0; i<len; i++) {
		  arr1[i]=scanner.nextInt();
	  }
	  System.out.println("Enetr second Array length ");
	  len=scanner.nextInt();
	  int[] arr2=new int[len];
	  for(int i=0; i<len; i++) {
		  arr2[i]=scanner.nextInt();
	  }
	  Arrays.sort(arr1);
	  Arrays.sort(arr2);
	  if(Arrays.equals(arr1,arr2)) {
		  System.out.println("Equal");
	  }
	  else {
		  System.out.println("Not Equal");  
	  }
  }
}
