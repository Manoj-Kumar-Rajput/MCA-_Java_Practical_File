package praticalfile;

interface Parent1{
	
	 default void show1(){
		System.out.println("Parent1 method call");
	}
}
interface Parent2{
	
	default void show2(){
		System.out.println("Parent2 method call");
	}
}
class Child implements Parent1, Parent2
{
		void show3(){
		System.out.println("Child method call");
	}
}
public class Interface_Implementation {

	public static void main(String[] args)
	{
		Child c=new Child();
		c.show1();
		c.show2();
		c.show3();
	}
}
