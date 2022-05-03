package praticalfile;
import java.util.Scanner;

class Vehicle
{
	int noofwheels;
	public void noofwheels(int noofwheels) {
		
		System.out.println("Number of wheels ="+noofwheels);
	}
}
class Bicycle extends Vehicle{
	
	public void show()
	{		
		System.out.println("Bicycle");
	}
}
class car extends Vehicle{
	public void show()
	{
		
		System.out.println("Car");
	}
}
class rickshaw extends Vehicle{
	public void show()
	{
		System.out.println("Rickshaw");
	}
}
public class UseInheritance {

	public static void main(String[] args)
	{
		Bicycle b=new Bicycle();
		car c =new car();
		rickshaw r=new rickshaw();
		b.show();
		b.noofwheels(2);
		c.show();
		c.noofwheels(4);
		r.show();
		r.noofwheels(3);
	}

}
