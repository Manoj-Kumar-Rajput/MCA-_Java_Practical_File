package praticalfile;
import java.util.Scanner;
import java.util.Random;
public class GuesserGame {

	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("You have 5 turns to guess right random number");
		int mynumber;
		int check=0;
		for(int i=0;i<5;i++)
		{
			Random ran=new Random();
			int random=ran.nextInt(10);
			System.out.println(" Turn "+(i+1)+" Enter the number ");
			mynumber=s.nextInt();
			
			if(mynumber==random)
			{
				check=1;
				System.out.println("You win");
				break;
			}
			if(mynumber<random)
			{
				System.out.println("less number Random number= "+random);
			}
			if(mynumber>random)
			{
				System.out.println("Greater Number Random number= "+random);
			}
		}
		if(check==0)
		{
			System.out.println("You loose");
		}
		
	}
}
