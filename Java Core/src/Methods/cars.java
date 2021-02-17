package Methods;
/*The parameterized constructor is used to provide different values to distinct objects*/

public class cars {
	
	String manfact_car;
	String Car_model;
	double onroadprice;
	
	cars(String car,String model,double price)
	{
		manfact_car=car;
		Car_model=model;
		onroadprice=price;
		
	}
	 public void aboutcars()
	 {
		 System.out.println("Manfacturer of the car		"+manfact_car);
		 System.out.println("Model of the car		"+Car_model);
		 System.out.println ("Car Onroad Price in Lakhs	"+onroadprice);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cars car1=new cars("Swift", "ZXI", 8.56000);
		cars car=new cars("Baleno", "ZXI", 8.5);
		car.aboutcars();
	
		
		

	}

}
