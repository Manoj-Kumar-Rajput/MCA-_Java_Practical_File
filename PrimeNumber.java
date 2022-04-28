package praticalfile;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		int check=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				check++;		
			}
		}
		if(check==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
