package week2.day4;

public class Calculator {
	
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	public void subTwoNumber(int e,int f) {
		int g=f-e;
		System.out.println(g);
	}
	public void mulTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNumber(80, 65);
		calc.subTwoNumber(58, 93);
		calc.mulTwoNumber(2512.25, 1752.65);
		calc.divTwoNumber(9854.63f, 3256.42f);
		
		
	}
}
