import java.util.Scanner;
class SlopPattern{
	
	public static void main(String[] args)
     {
     	Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    for(int i=0 ; i<number; i++){
    	for(int j=1; j<number; j++){
    		if(j<number-i)
             System.out.print(1);
         else
         	System.out.print(i+1);
    }
    System.out.println();
}
    }
}