package problems;
import java.util.Scanner;
public class LeaderOfAnArray {
 public static void main(String[] args) {
	 LeaderOfAnArray leader=new LeaderOfAnArray();
	 leader.findLeader();
 }
 
 private void findLeader() {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter Length of an Array");
	 int size=scanner.nextInt();
      	int [] arr=new int[size];
      	
      	for(int i=0; i<size; i++) {
      		System.out.println("Enter the Number");
      		arr[i]=scanner.nextInt();
      	}
      	boolean flag;
	 for(int i=0; i<size; i++) {
		 flag=true;
		 for(int j=i; j<size; j++) {
			 if(arr[i]<arr[j]) {
				 flag=false;
				 break;
			 }
		 }
		 if(flag) {
			 System.out.print(arr[i]+" ");
		 }
	 }
 }
}
