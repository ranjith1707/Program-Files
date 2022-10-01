package demo;
import java.util.Scanner;
public class FourtyAnswer {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
	  FourtyAnswer answer=new FourtyAnswer();	
	  answer.functions();
	
	}
		
	
	void functions() {
		System.out.println("Enter Final Result VAlues");
		int result=input.nextInt();
		int[] values=new int[4];
		int given;
		for(int i=0; i<4; i++) {
			System.out.println("Enter the Number");
			given =input.nextInt();
			values[i]=given;
		}
		char[] oporator= {'+','-','*','/'};
		int out = 0;
		   int a;
		   int b; 
		   int c;
		   int d;
		   char add;
		   char sub;
		   char mul;
		   char div;
		   String equatin="";
		   boolean flag=true;
		   while(flag) {
			   ff:
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					for(int l=0; l<4; l++) {
						if(i==j||i==k||i==l) {
							continue;				
						}
						if(j==i||j==k||j==l) {
							continue;				
						}
						
						if(k==i||k==j||k==l) {
							continue;			
						}
						
						if(l==i||l==k||l==j) {
							continue;			
						}
						
						a=values[i];
						b=values[j];
						c=values[k];
						d=values[l];
						
						for(int m=0; m<4; m++) {
							for(int n=0; n<4; n++) {
								for(int o=0; o<4; o++) {
									for(int p=0;p<4; p++) {
										equatin+=a;
										out=a;
										 add=oporator[m];
										 sub=oporator[n];
										 mul=oporator[o];
										 div=oporator[p];
										 
										 if(add=='+') {
											 out+=b;
											 equatin+="+"+b;
										 
										 }
										 else if(add=='-') {
											 out-=b;
											 equatin+="-"+b;
										 
										 }
										 else if(add=='*') {
											 out*=b;
											 equatin+="*"+b;
										 
										 }
										 else if(add=='/') {
											 out/=b;
											 equatin+="/"+b;
										 
										 }
										 if(sub=='+') {
											 out+=c;
											 equatin+="+"+c;
										 
										 }
										 else if(sub=='-') {
											 out-=c;
											 equatin+="-"+c;
										 
										 }
										 else if(sub=='*') {
											 out*=c;
											 equatin+="*"+c;
										 
										 }
										 else if(sub=='/') {
											 out/=c;
											 equatin+="/"+c;
										 
										 }
										 
										 if(mul=='+') {
											 out+=d;
											 equatin+="+"+d;
										 
										 }
										 else if(mul=='-') {
											 out-=d;
											 equatin+="-"+d;
										 
										 }
										 else if(mul=='*') {
											 out*=d;
											 equatin+="*"+d;
										 
										 }
										 else if(mul=='/') {
											 out/=d;
											 equatin+="/"+d;
										 }
										
									if(out==result) {
										 System.out.println(equatin);
										break;
									}
									equatin="";
									}
									if(out==result) {
										break;
										}
								}
								if(out==result) {
									break;
								}

							}
							if(out==result) {
								break;
							}
						}
						if(out==result) {
							break;
						}
								
					}
					if(out==result) {
						break;
					}
						
	    }
				if(out==result) {
					break;
				}
      }
			if(out==result) {
				break;
			}
   }
			   if(out==result) {
					flag=false;
				}
		}
		   System.out.println(out);
		   System.out.println(equatin);
		   }
	}
