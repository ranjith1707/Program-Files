package demo;
abstract class Parant{
	abstract void run(); 
		
	void myMethod() {
		run();
	}

	


}
abstract class Child extends Parant{
	 void run() {
		 System.out.println("hai");
	 }
		
	void method() {
		System.out.println("method is running");
	}
}


public class ParantChild {
public static void main(String[] args) {
	
}
}
