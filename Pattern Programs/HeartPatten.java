import java.util.Scanner;
	public class HeartPatten{
	public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the Size Of Heart");
int given =input.nextInt();
String s="engineering";
int pointer=0;
int check=given/2;
   for(int i=0; i<given/2+((given/2)-3); i++){
   	 if(i>=check-1){
   	  for(int j=1; j<=given; j++){
   	  	if(pointer>=s.length()-1)
   	  		pointer=0;
   if(j<check||j>given-check){
   	System.out.print(" ");
   	  }
   	  else{
   	  	System.out.print(s.charAt(pointer));
   	  }
   	  pointer++;
   	  }
   	  for(int k=1; k<=given; k++){
   	  	if(pointer>=s.length()-1)
   	  		pointer=0;
       if(k<check||k>given-check){
   	    System.out.print(" ");
   	    }
   	  else{
   	  	System.out.print(s.charAt(pointer));
   	  	
   	  }
   	  pointer++;
   }
}
   check--;
   System.out.println();
   }
   pointer=0;
   int position=given*2;
   for (int i=given; i>0; i--){
     for (int n = 1; n <= given - i; n++) {
                if(pointer>=s.length()-1)
   	  		pointer=0;
                System.out.print(" ");
                pointer++;
            }
 
            // Inner loop 2 print star
            for (int n = 1; n <= i * 2 - 1; n++) {
                if(pointer>=s.length()-1)
   	  		pointer=0;
                System.out.print(s.charAt(pointer));
                pointer++;
              
            }
      System.out.println();
      position--;
   }
}
}
