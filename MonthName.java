package praticalfile;
import java.util.Scanner;
public class MonthName {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year");
		int year=s.nextInt();
		System.out.println("Enter any number between 1 to 12");
		int no=s.nextInt();
		if(no==1 ||no==3 ||no==5||no==7||no==8||no==10||no==12)
		{
			System.out.println("Number of days == 31");
		}
		else if(no==4 || no==6 ||no==9 || no==11)
		{
			System.out.println("Number of days == 30");
		}
		else if(no==2)
		{
			if(year%4==0)
			{
				System.out.println("Number of days == 29 And its leap year");
			}
			else
			{
				System.out.println("Number of days == 28");
			}
		}
		else {
			System.out.println("Wrong input");
		}
	}

}
