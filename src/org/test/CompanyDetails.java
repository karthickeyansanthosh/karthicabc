package org.test;

public class CompanyDetails extends EmployeeDetails{
	public static void main(String[] args) {
		int age = 25;
		if (age <=18) {
		System.out.println("the are eligible to work");
		}else {
			System.out.println("the are not eligible to work");
		}
		CompanyDetails E = new CompanyDetails();
		E.companyId();
		E.companyName();
		E.empid();
		E.empName();
	}
private void companyName() {
System.out.println("Company name is TCS");
}
private void companyId() {
System.out.println("Company id is 1234566");
}
@Override
	public void empid() {
		System.out.println("EMployee id is 145");
	}

}
