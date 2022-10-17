 package demo;
import java.util.*;
import java.util.regex.*;
public class StrongPassword {
	 public static void main (String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("ENetr String :");
			String password=scanner.nextLine();
			System.out.println( minimumNumber(password.length(),password));
			}
	
	 
	 public static int minimumNumber(int n, String password) {
		    // Return the minimum number of characters to make the password strong    
		           int count=0;
		           Pattern letter=Pattern.compile("[a-z]");
		             Matcher lettMatch=letter.matcher(password);
		           Pattern special=Pattern.compile("[\\W]");
		              Matcher specialMatch=special.matcher(password);
		          
		           Pattern numb=Pattern.compile("[0-9]");
		                Matcher numberMatch=numb.matcher(password);
		           Pattern letterup=Pattern.compile("[A-Z]");
		            Matcher letUpMatch=letterup.matcher(password);
		              
		          
		         if(n>=6) {
		        	 
		        	 if(numberMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			           if(lettMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			           if(letUpMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			          
			           if(specialMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
		         }
		         else {
		        	 if(numberMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			           if(lettMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			           if(letUpMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			          
			           if(specialMatch.find()){
			               
			           }
			           else{
			              count++; 
			           }
			           if(count+password.length()>=6) {
			        	   return count;
			           }
			           else {
			        	   return (6-password.length());
			           }
		        	
			           
		         }
		    
		    return count;
		           
		    }
 }



