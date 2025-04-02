package details;

public class Employee{
	String Emp_name;
	double Emp_Salary;
	long Emp_Phno;
	String Emp_id;
	public void Emp1() {
		String Emp_name="Siddharth";
		System.out.println("emp_name:"+Emp_name);
		double Emp_Salary=18000;
		System.out.println("Emp_Salary"+Emp_Salary);
		long Emp_Phno=123456789l;
		System.out.println("Emp_phno:"+Emp_Phno);
		String Emp_id="Fe3001";
		System.out.println("emp_id:"+Emp_id);
		
		
	}
	public void Emp2() {
		
		String Emp_name = "sanjeeth";
		double Emp_Salary = 18000.66;
		Emp_Phno = 987654322l;
		Emp_id = "FE5001";
		System.out.println("emp_name:"+Emp_name);
		System.out.println("Emp_Salary"+Emp_Salary);
		System.out.println("Emp_phno:"+Emp_Phno);
		System.out.println("emp_id:"+Emp_id);
		
		
	}
	public static void main(String[] args) {
		Employee details=new Employee();
		details.Emp1();
	    details.Emp2();
	}
	

}