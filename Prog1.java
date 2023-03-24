package PolyProgram;
// compile time polymorphism (method overloading)
public class Prog1 {

	public void add1() {
		int a=3, b=4, c;
		c=a+b;
		System.out.println("Sum="+c);
	}
	public void add1(int a) {
		int c;
		c= a+a;
		System.out.println("Sum=" +c);
	}
	public void add1 (int a , int b){
		int c;
		c=a+b;
		System.out.println("Sum=" + c);	
	}
	public void add1(double a) {
		double c;
		c= a+a;
		System.out.println("Sum="+ c);
	}
	public void add1(double a, double b) {
		double c;
		c=a+b;
		System.out.println("Sum="+ c);
	}
	public static void main(String[] args) {
		Prog1 e = new Prog1();
		e.add1();
		e.add1(78);
		e.add1(89, 76);
		e.add1(67.87);
		e.add1(77.88, 89.66);
		
	}

}
