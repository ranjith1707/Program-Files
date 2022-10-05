import java.util.Scanner;
public class SquarePattern{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
	   SquarePattern square=new SquarePattern();
	   square.pattern();
	}
	void pattern(){
       int given=scanner.nextInt();
       int number=given;
       for(int i=1; i<given*2; i++){
       	number=given;
         for(int j=1; j<given*2; j++){       
         	if(i<=given){
         	if(j>given*2-i){
         		number++;
         	}	
              System.out.print(number);
              System.out.print(" ");
              if(i>j){
         			number--;
         		}
         	}
         	if(i>given){
             if(i<j){
         			number++;
         		}
              System.out.print(number);
              System.out.print(" ");
               if(j<given*2-i){
         		number--;
         	}	
              
         	}
         	
         }
         System.out.println();
       }
	}
}