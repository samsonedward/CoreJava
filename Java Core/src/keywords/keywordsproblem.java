package keywords;

/*this is a reference variable that refers to the current object*/

public class keywordsproblem {

	/* Instance Variable */
	String mobile;
	String mobile_model;
	int price;

	/* Parameterized Constructor */
	keywordsproblem(String mobile, String mobile_model, int price) {

		this.mobile = mobile;
		this.mobile_model = mobile_model;
		this.price = price;

	}

	void showroom() {
		System.out.println(mobile + "" + mobile_model + "" + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object created//
		keywordsproblem problem = new keywordsproblem("Samsung", "Galaxy", 35000);
		problem.showroom();

	}

}
