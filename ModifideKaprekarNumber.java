package demo;
import java.util.Scanner;
public class ModifideKaprekarNumber {
	public static void main(String[] args) {
		 ModifideKaprekarNumber numbers=new  ModifideKaprekarNumber();
		 numbers.method();
	}
	
	private void method() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr Starting number ");
		 int p=scanner.nextInt(); 
		 System.out.println("Enter The Ending Number ");
		 int q=scanner.nextInt();
		 String val;
		   long out=0;
		    boolean flag=false;
		    for(long i=p;i<=q; i++ ){
		    	long h=i*i;	        
		        val=String.valueOf(h);
		        String[] arr=val.split("");
		        int index=0;      
		        for(int k=0; k<arr.length; k++) {
		        	String temp="";
		        	if((index<arr.length)) {
		        		int legthOfj;
		        		if((arr.length%2!=0&&k==0)&&String.valueOf(i).length()!=1) {
		        			legthOfj=String.valueOf(i).length()-1;
		        		}
		        		else {
		        			legthOfj=String.valueOf(i).length();
		        		}
		        for(int j=0; j<legthOfj; j++){
		        	if(index<arr.length) {
		            temp+=arr[index++];
		        	}
		            
		        }
		        	}
		        	else {
			        	temp="0";
			        }
		        out+=Integer.parseInt(temp);
		        }
		        if(out==i){
		        	flag=true;
		            System.out.print(i+" ");            
		        }
		        out=0;  
		    }
		    if(!flag) {
		    	   System.out.println("INVALID RANGE");
		       }
	}
}
