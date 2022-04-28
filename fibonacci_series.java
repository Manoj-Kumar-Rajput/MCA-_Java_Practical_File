package praticalfile;
import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number which you want to present in fibonacci series");
		int no=s.nextInt();
		int num1,num2,sum;
		num1=num2=1;
		if(no==1)
		{
			System.out.println(num1);
		}
		else if(no==2)
		{
			System.out.print(num1+" " +num2+ " ");
		}
		else
		{
			int i=0;
			System.out.print(num1+" " +num2+ " ");
			while(i<no-2)
			{
				sum=num1+num2;
				num1=num2;
				num2=sum;
				System.out.print(num2+" ");
				i++;
			}

		}
				
	}
}
