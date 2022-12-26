package week1.day1;

public class Calculator {
		public void sub()
		{
			int a=500;
			int b=200;
			System.out.println(a-b);
		}
		
		public int mul(int a,int b) {
			return a*b;
		}
		public static void main(String[] args) {
			Calculator calc=new Calculator();
			calc.sub();
			int result=calc.mul(64,98);
			System.out.println(result);
		}
}
