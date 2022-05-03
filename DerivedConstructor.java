package praticalfile;

class base{
	
	 base()
	 {
			System.out.println("Base class default constructor call");
	 }
	 base(int no)
	 {
		 this();
		 System.out.println("Base class parameterized constructor call");
	 }
}

class derived extends base{
	derived(){
		
		super(5);
		System.out.println("Derived class constructor ");
		
	}
}
public class DerivedConstructor {

	public static void main(String[] args)
	{
		///use of default constructor in inheritance is it when we
		// call derived class automatically base class constructor call
		new derived();
	}
}
