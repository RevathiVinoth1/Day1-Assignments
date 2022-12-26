package week1.day1;

public class Calculator1 {
	
	public int addition(int a,int b) {
		return a+b;
	}
	public int addition1(int a,int b,int c) {
		return a+b+c;
	}
	public int subtaction(int a,int b) {
		return a-b;
	}
	public double subtraction1(double a,double b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public double multiply1(int a,double b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
	public double division1(double a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		
		Calculator1 cal=new Calculator1();
		int add=cal.addition(30,80);
		int add1=cal.addition1(25,20,19);
		int sub=cal.subtaction(56,20);
		double sub1=cal.subtraction1(14.5,3.5);
		int mul=cal.multiply(23,5);
		double mul1=cal.multiply1(27,15.4);
		int divin=cal.division(35,7);
		double divin1=cal.division1(46.2,3);
		System.out.println("The Arithmetic Operations Are:");
		System.out.println("The Result of Addition is " +add);
		System.out.println("The Result of Addition1 is " +add1);
		System.out.println("The Result of Subtraction is " +sub);
		System.out.println("The Result of Subraction1 is " +sub1);
		System.out.println("The Result of Multiplication is " +mul);
		System.out.println("The Result of Multiplication1 is " +mul1);
		System.out.println("The Result of Divition is " +divin);
		System.out.println("The Result of Divition1 is " +divin);
	}
}
