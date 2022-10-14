package demo;
import java.util.Scanner;
import java.util.Arrays;
public class BoatProblem {
	 Scanner scanner=new Scanner(System.in);
   public static void main(String[] args) {
	   BoatProblem boat=new BoatProblem();
	   boat.method();
   }
   private void method() {
	   System.out.println("Enter Length Of Array ");
	 int size=scanner.nextInt();
	 int[] array=new int[size];
	 int given;
	 for(int i=0; i<size; i++) {
		 given=scanner.nextInt();
		 array[i]=given;
	 }
	 int weight;
	 int boat=0;
	 System.out.println("Eneter Weight Limit : ");
	 int limit=scanner.nextInt();
	 Arrays.sort(array);
	 System.out.println(Arrays.toString(array));
	main:
	 for(int i=size-1; i>=0; i--) {
		 weight=array[i];
		 for(int j=i; j>=0;j--) {
			 int temp=weight;
			 if(array[i]>=limit||(i==0)&&array[i]!=0) {
				 boat++;
				 array[i]=0;
				 continue main;
			 }
			 if(i!=j && array[j]!=0) {
			   temp+=array[j];
			 if(temp<limit) {
				 weight+=array[j];
				 array[j]=0;
				 array[i]=0;
			 }
			 else if(temp==limit) {
				 weight+=array[j];
				 array[i]=0;
				 boat++;
				 array[j]=0;
				 weight=0;
				 continue main;
			 }
			 
		 }
		 }
		 if(weight<limit&&weight!=0) {
			 boat++;
		 }

		
	 }
	 System.out.println(Arrays.toString(array));
	 System.out.println(boat);
   }
}
