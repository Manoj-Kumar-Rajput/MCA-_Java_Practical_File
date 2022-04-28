package praticalfile;
import java.util.Scanner;
public class OverloadFunction {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Press1: for Square Area ");
		System.out.println("Press2: for Rectangle Area");
		System.out.println("Press3: for Circle Area  ");
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:			
			System.out.println("Enter the value");
			Area(s.nextInt());
			break;
		case 2:
			System.out.println("Enter the value of length and breath");
			Area(s.nextInt(), s.nextInt());
			break;
		case 3:
			System.out.println("Enter the value of pie and radius");
			Area(s.nextFloat(), s.nextInt());
			break;
		default:
			System.out.println("Wrong input");
		}
	}
	public static void Area(int value)
	{
		System.out.println("Area of Square = "+ (value*value));
	}
	public static void Area(int length ,int breath)
	{
		System.out.println("Area of Rectangle = "+ (length*breath));
	}
	
	public static void Area(float pie ,int radius)
	{
		float area=pie*radius*radius;
		System.out.println("Area of Rectangle = "+ area);
	}

}
