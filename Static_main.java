package rizon;

import java.util.Scanner;

public class Static_name {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the data");
	Static_method.roll=input.nextInt();
	Static_method.name=input.nextLine();
	
	Static_method. display_info();
}
}
