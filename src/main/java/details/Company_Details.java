package details;

public class Company_Details {
	String Comp_Name="W3Softech";
	String Comp_Adress="Gachibowli";
	String Job_role="Java_Developer";
	String Emp_Name="Venkat";	
	public void Office_Details() {
		System.out.println(Comp_Name);
		System.out.println(Comp_Adress);
		System.out.println(Job_role);
		System.out.println(Emp_Name);
	}
public static void main(String[] args) {
	Company_Details Details=new Company_Details();
	Details.Office_Details();
}

}


