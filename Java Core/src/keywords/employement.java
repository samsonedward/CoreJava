package keywords;

public class employement {

	// instance variable
	
	int empid;
	String name;
	String company;
	
	// Static Variable
	static String aadhar = "Samson";

	static void aadharcard() {
		aadhar = "SamsonEdward";
	}
	
	//method to display values  
    void display(){System.out.println("staticname "+aadhar );
    }  
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employement e1=new employement();
		e1.display();
		
		
	}

}

