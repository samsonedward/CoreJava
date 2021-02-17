package Methods;

/*Constructor is block of code similar to method,constructor name and class name should be same;
 * A Constructor must have no explicit return type;
A Java constructor cannot be abstract, static, final, and synchronized*/

public class defaultconstruc {

	// Default Constructor without Parameters//
	String defaultconstruc_name;
	int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		defaultconstruc constr = new defaultconstruc();
		System.out.println(constr.defaultconstruc_name);
		System.out.println(constr.number);

	}
	// No Argument Constructor//

		void  defaultconstruc() {
		System.out.println("Default Constructor");

	}

}
