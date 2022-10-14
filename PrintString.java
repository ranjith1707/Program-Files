package demo;

public class PrintString {
public static void main(String[] args) {
	 PrintString p=new  PrintString();
	 p.method();
}
private void method() {
	String str="leed2code3";
	String temp="";
    String output="";
    String result="";
      for(int i=0; i<str.length(); i++) {
    	  
    	  if(Character.isDigit(str.charAt(i))) {
    		  int size=Character.getNumericValue(str.charAt(i));    		  
    		  for(int j=0; j<size; j++) {				  
    			  output=output+temp;  				    
    		  }
			  
			  temp=output;	 
    	  }
    	  else
    	  {
    		  temp+=str.charAt(i);
    		  output+=str.charAt(i);
    	  }
    	
      }
     
      System.out.println(output);
      
}
}
