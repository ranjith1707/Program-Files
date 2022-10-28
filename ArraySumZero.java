package problems;
import java.util.*;
public class ArraySumZero {
  public static void main(String[] args) {
	  ArraySumZero arrSum=new ArraySumZero();
	  arrSum.sumOfArray();
  }
  private void sumOfArray() {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter Array Length");
	 ArrayList<String> list=new ArrayList<String>();
	 int siz=scanner.nextInt();
	 ArrayList<String> arrList;
	 int[] arr=new int[siz];
	 
	 for(int i=0; i<siz; i++) {
		 arr[i]=scanner.nextInt();
	 }
	 String exp="";
	 int count=0;
	 for(int i=1; i<siz; i++) {
		 for(int j=0; j<siz; j++){
			for(int k=j; k<i; k++) {
				count+=arr[k];
				exp+=arr[k];
			}
			if(count==0) {
				list.add(exp);
			}
			 exp="";
			 count=0;
		 }
	 }
	 int max=0;
	 String out="";
	for(int i=0; i<list.size(); i++) {
		String[] temp=list.get(i).split("");
		arrList=new ArrayList<String>(Arrays.asList(temp));
		while(arrList.contains("-")) {
			arrList.remove("-");
		}
		if(arrList.size()>max) {
			max=arrList.size();
		}
	}
	System.out.println("Length of Array is : "+max);
  }
}
