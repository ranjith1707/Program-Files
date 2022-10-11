package demo;

public class TheTimeInWords {
	public static void main(String[] args) {
		TheTimeInWords timeing=new TheTimeInWords();
		timeing.method();
	}
	private void method() {
		int h=3;
		int m=45;
		String times="";
	 String[] time={"one", "two","three","four","five","six","seven","eight","nine","ten","eleven","twelve", "thirteen","fourteen","quarter",
		 "sixteen","seventeen","eighteen","nineteen","twenty"};  
	if(m==30) {
		times+="half past "+time[h-1];
	}
	if(m==0) {
		times+=time[h-1]+" o' clock";
	}
	 if(m<30) {
					 if(m>20) {
						   
					     times+=time[20-1] +" ";
				 String temp=String.valueOf(m);
				int a= Character.getNumericValue(temp.charAt(1)) ;
				times+=time[a-1]+" minutes past "+time[h-1];
			 }
					 else if(m!=1) {
		 times+=time[m-1]+" minutes past "+time[h-1];
	 }
					 else {
						 times+=time[m-1]+" minute past "+time[h-1];
					 }
	 }
	
	 if(m>30) {
		 int minuite=60-m;
		
		   if(minuite>20) {
			   
			     times+=time[20-1] +" ";
		 String temp=String.valueOf(minuite);
		int a= Character.getNumericValue(temp.charAt(1)) ;
		times+=time[a-1]+" minutes to "+time[h];
	 }
		   else if(minuite==15){
               times+=time[minuite-1]+" to "+time[h-1]; 
             }
		   else {
			   times+=time[minuite-1]+" minutes to "+time[h];
		   }
	
	 
}
	  
	 System.out.println(times);
}
}