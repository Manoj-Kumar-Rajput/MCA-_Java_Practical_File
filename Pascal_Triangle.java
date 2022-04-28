package praticalfile;
import java.util.Scanner;
public class Pascal_Triangle 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i;j++)
			{
					System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
}
 