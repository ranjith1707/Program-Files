package demo;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CircularArrayRotation {
	Scanner scanner=new Scanner(System.in);
     public static void main(String[] args) {
    	 CircularArrayRotation rotate=new CircularArrayRotation();
    	 rotate.method();
     }
     
     private void method() {
    	  List<Integer> arr=new ArrayList<Integer>();
    	 
           List<Integer> a=new ArrayList<Integer>();
           System.out.println("Enter Array Length");
           int len=scanner.nextInt();
           for(int i=0; i<len; i++) {
        	   a.add(scanner.nextInt());
           }
           List<Integer> queries=new ArrayList<Integer>();
           System.out.println("Enetr the length of  query ");
           len=scanner.nextInt();
           
            for(int i=0; i<len; i++) {
            	queries.add(scanner.nextInt());
            }
           System.out.println("Entre Number Of rotation");
    		   int k=scanner.nextInt();
    		    Collections.rotate(a,k);
    		    System.out.println(a);
    		    for(int i=0;i<queries.size(); i++){
    		        arr.add(a.get(queries.get(i)));
    		    }
    		   System.out.println( arr);
    		   
     }
}
