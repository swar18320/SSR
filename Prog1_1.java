package PolyProgram;
// method overloading
public class Prog1_1 {
	public void s1() {
		int k = 34 , l= 22, m;
		m= k/l;
		System.out.println("Sum="+ m);
	}
	public void s1 (int x ) {
		int z;
		z= x*x;
		System.out.println("Sum="+ z);
	}
	public void s1(int x,int y) {
		 int z=x*y;
		 System.out.println("Sum=" + z); 
		}
	public void s1 (double x , double y) {
		double z=x-y;
		System.out.println("Sum=" + z);
	}
	public void s1(String name) {
		System.out.println("insane" + " " + name);
	}

	
	public static void main(String[] args) {
		Prog1_1 v = new Prog1_1();
		v.s1();
		v.s1(33);
		v.s1(2, 3);
		v.s1(22.33, 34.67);
		v.s1("Virat Kohli");
		

	}

}
