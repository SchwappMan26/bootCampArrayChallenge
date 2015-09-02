import java.util.Scanner;
public class bootCampArrayChallenges4
	{

		public static void main(String[] args)
			{
				int thousands[]=new int[4];
				Scanner userInput = new Scanner(System.in);
				System.out.println("User input a four digit number");
				int thousandsNum = userInput.nextInt();	
				System.out.println("The number in reverse is: ");
				int a = thousandsNum%10;
				thousands[0]=a;
				int b= (thousandsNum/10%10);
				thousands[1]=b;
				int c= thousandsNum/10/10%10;
				thousands[2]=c;
				int d = thousandsNum/10/10/10%10;
				thousands[3]=d;
				System.out.println(d);
				for (int fred: thousands)
					{
						System.out.println(fred);
					}
			}

	}
