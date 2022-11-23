package problems;

import java.util.Scanner;

public class VariableArgument {
	Scanner scanner=new Scanner(System.in);
  public static void main(String[] args) {
	  VariableArgument printString=new VariableArgument();
	  printString.getStr();
  }
  private void getStr() {
	
	  print("ertyi");
	  print("ertyi","ertyu","fghjk");
  }
  private void print(String...strig ) {
	  for(String str:strig) {
		  System.out.print(str);
	  }
  }
}
