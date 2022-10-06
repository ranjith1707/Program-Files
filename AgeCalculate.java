import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
class AgeCalculate{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
      AgeCalculate age=new AgeCalculate();
      age.method();
	}

	void method(){
       String age=scanner.nextLine();
       LocalDate dob=LocalDate.parse(age);

       LocalDate crd=LocalDate.now();

       System.out.println(Period.between(dob,crd).getYears());
	}
}