package Methods;

public class staticmethods {

	int emp_id;
	String Associate_Name;
	static String company_name = "Cognizant";

	void employee(int emp_id, String Associate_Name) {
		System.out.println("Associate EmployeeID	" + emp_id);
		System.out.println("Associate Name 		" + Associate_Name);
		System.out.println("Associated Company	" + company_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticmethods s1 = new staticmethods();
		s1.employee(251317, "Samson Edward");
		System.out.println();
		s1.employee(251318, "Praveena");

	}

}
