package praticalfile;

class A{
	A()
	{
		this('A');
		System.out.println("Default constructor call");
	}
	A(char c)
	{
		this("MANoj", 27);
		System.out.println("Grade ="+c);
	}
		
	A(String name,int no)
	{
		System.out.println("Name ="+name);
		System.out.println("Roll no. ="+no);
		
	}

}

public class Constructor{
	public static void main(String[] args)
	{
		A test=new A();
	}
}