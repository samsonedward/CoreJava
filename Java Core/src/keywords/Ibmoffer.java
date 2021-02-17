package keywords;

public class Ibmoffer extends job {
	
	String Name = "IBM";
	int salary = 50000;
	String location="Bangalore";
	
	void getoffer() {
	System.out.println("IBM Salary:	 "+this.salary);
	System.out.println("IBM Location:	 "+this.location);
System.out.println("IBM Salary:	 "+super.salary);
	System.out.println("IBM Location:	 "+super.location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated methoIbmofferd stub
		Ibmoffer offer=new Ibmoffer();
		offer.getoffer();

	}

}
