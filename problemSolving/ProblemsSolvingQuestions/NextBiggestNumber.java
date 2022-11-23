package problems;
import java.util.Arrays;
import java.util.Scanner;
public class NextBiggestNumber {
	Scanner scanner=new Scanner(System.in);
  public static void main(String[] args) {
	  NextBiggestNumber bigestNumber=new NextBiggestNumber();
	  bigestNumber.method();
  }  
  private void method() {
	  System.out.println("Enetre The Value");
	  String given=scanner.nextLine();
	  char[] arr=given.toCharArray();
	  char[] an=given.toCharArray();
      Arrays.sort(an);
	  System.out.println(Arrays.toString(arr));
	  for(int j=0; j<arr.length; j++) {
	    for(int i=0; i<arr.length; i++) {
		  if(arr[j]==an[i]) {
			  if(i<an.length-1) {
			  arr[j]=an[i+1];
			  break;
			  }
		  }
	  }
	  }
	  System.out.println(Arrays.toString(arr));
  }
}
