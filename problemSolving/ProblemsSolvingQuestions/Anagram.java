package problems;
import java.util.*;
public class Anagram {
   public static void main(String [] args) {
	   Anagram obj=new Anagram();
	   obj.anagram();
   }
   private void anagram() {
	   Scanner scanner=new Scanner(System.in);
	   String str=scanner.nextLine();
	   String st1="";
	   String st2="";
	   int siz;
	   int freq=0;
	   if(str.length()%2==0) {
		siz=str.length()/2;
	   }
	   else {
		   siz=(str.length()/2)+1; 
	   }
	   ArrayList<String> list=new ArrayList<String>();
	  Set <String> set ;
	   for(int j=1; j<str.length()-1; j++) {
		   for(int i=0; i< siz; i++) {
			  	st1+=str.charAt(i);
			  	st2+=str.charAt(str.length()-i-1);
			   if(st1.length()>=j) {
				 char[] temp1=st1.toCharArray();
				 char[] temp2=st2.toCharArray();
				 Arrays.sort(temp1);
				 Arrays.sort(temp2);
				 list.add(String.valueOf(temp1));
				 list.add(String.valueOf(temp2));
				   st1="";
				   st2="";
			   }
		   }
		  set=new HashSet<String>(list);
		  for(String a:set) {
			 
			  int count=Collections.frequency(list,a);
			  if( count>=2) {
				freq++;
			  }
		  }
		  list.clear();

}	
	   System.out.println(freq);
	   
   }
}
