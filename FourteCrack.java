package demo;
import java.util.Scanner;
public class FourteCrack {
	Scanner input=new Scanner(System.in);
public static void main(String[] args) {
	FourteCrack fourt=new FourteCrack();
	fourt.getInput();
}
void getInput() {
	System.out.println("Enter Final result Number ");
	int resuls=input.nextInt();
	int[] numbers=new int[4];
	int given;
	for(int i=0; i<4; i++) {
		given=input.nextInt();
		numbers[i]=given;
	}
	int output=0;
   int out = 0;
   int a;
   int b; 
   int c;
   int d;
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
				
				 if(a+b+c+d==resuls) {
					 out=a+b+c+d;
					 System.out.println(a+"+"+b+"+"+c+"+"+d);
					break ff;
				 }
				
				else if(a+b+c-d==resuls) {
					out=a+b+c-d;
					 System.out.println(a+"+"+b+"+"+c+"-"+d);
					 break ff;
				 }
	
				else if(a+b-c+d==resuls) {
					out=a+b-c+d;
					 System.out.println(a+"+"+b+"-"+c+"+"+d);
					 break ff;
				 }
		
				else if(a-b+c+d==resuls) {
					out=a-b+c+d;
					 System.out.println(a+"-"+b+"+"+c+"+"+d);
					 break ff;
				 }
			
				else if(a+b+c*d==resuls) {
					out=a+b+c*d;
					 System.out.println(a+"+"+b+"+"+c+"*"+d);
					 break ff;
				 }
				
				else if(a+b*c+d==resuls) {
					out=a+b*c+d;
					 System.out.println(a+"+"+b+"*"+c+"+"+d);
					 break ff; 
				}
				else if(a+b*c-d==resuls) {
					out=a+b*c-d;
					 System.out.println(a+"+"+b+"*"+c+"-"+d);
					 break ff; 
				}				
				else if(a*b+c+d==resuls) {
					out=a*b+c+d;
					 System.out.println(a+"*"+b+"+"+c+"+"+d);
					 break ff; 
				}
				else if(a*b+c-d==resuls) {
					out=a*b+c-d;
					 System.out.println(a+"*"+b+"+"+c+"-"+d);
					 break ff; 
				}
				
				else if(a+b+c/d==resuls) {
					out=a+b+c/d;
					 System.out.println(a+"+"+b+"+"+c+"/"+d);
					 break ff;
					 }	
				else if(a+b/c-d==resuls) {
					out=a+b/c+d;
						 System.out.println(a+"+"+b+"/"+c+"-"+d);
						 break ff; 
					}
				else if(a+b/c+d==resuls) {
					out=a+b/c*d;
						 System.out.println(a+"+"+b+"/"+c+"+"+d);
						 break ff; 
					}
				else if(a+b/c*d==resuls) {
					out=a+b/c*d;
						 System.out.println(a+"+"+b+"/"+c+"*"+d);
						 break ff; 
					}
				else if(a-b/c+d==resuls) {
					out=a-b/c+d;
						 System.out.println(a+"-"+b+"/"+c+"+"+d);
						 break ff;	 
					}
				else if(a/b+c+d==resuls) {
					out=a/b+c+d;
						 System.out.println(a+"/"+b+"+"+c+"+"+d);
						 break ff;
					}
				else if(a/b+c-d==resuls) {
					out=a/b+c-d;
						 System.out.println(a+"/"+b+"+"+c+"-"+d);
						 break ff;
					}
				else if(a/b-c+d==resuls) {
					out=a/b-c+d;
						 System.out.println(a+"/"+b+"-"+c+"+"+d);
						 System.out.println(out);
						 break ff;
					}
				else if(a*10+b-c*d==resuls) {
					out=a*10+b-c*d;
						 System.out.println(a+""+b+"-"+c+"*"+d);
						 System.out.println(out);
						 break ff;
					}
				 
			}
		}
	}
}
	    if(out==resuls) {
			flag=false;
		}
   }

   }
}

