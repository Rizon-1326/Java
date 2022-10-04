package inherit;

public class student extends Person {
	static String address;
	 static int roll;
	
	void display1()
	{
		
		display();
		System.out.println("Student info  ::");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Roll :"+roll);
		System.out.println("Address :"+address);
	}
}
