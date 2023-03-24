package PolyProgram;

public class EncapsulationProg {
	private double salaryofEmp;
	public void setSalary(double salary) {
		salaryofEmp=salary;
		
		//System.out.println(salary);
	}
	public void getSalary() {
		System.out.println("Salary of employee=" + salaryofEmp);
	}
	
	public static void main(String[] args) {
		EncapsulationProg z = new EncapsulationProg();
		z.getSalary();
		z.setSalary(60000.7686);
		z.getSalary();
		
	}

}
