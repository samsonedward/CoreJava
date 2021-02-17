package Methods;

public class Constructoroverloadings {
	String name;
	String course;
	int year;
	
	Constructoroverloadings(String n,String c)
	{
		String name=n;
		String course=c;
	}
	void object()
	{
		System.out.println("Name"+name);
		System.out.println("Course"+course);
	}
	Constructoroverloadings(String n,String c,int y)
	{
		String name=n;
		String course=c;
		int year=y;
	}
	void objects()
	{
		System.out.println("Name"+name);
		System.out.println("Course"+course);
		System.out.println("integer"+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloadings s1=new Constructoroverloadings("samson", "Selenium with Java");
		Constructoroverloadings s2=new Constructoroverloadings("samson", "Selenium with Java",2020);
		s1.object();
		s2.objects();
	}

}
