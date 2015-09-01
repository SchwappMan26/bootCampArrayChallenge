import java.util.Scanner;

public class bootCampArrayChallenge2
	{

		public static void main(String[] args)
			{
				System.out.println("User, input 8 numbers");
				int displayNumbers[]=new int[8]; 	
				Scanner userInput2= new Scanner(System.in);
				for (int i=0; i<8; i++)
					{					
						int num = userInput2.nextInt();
						displayNumbers[i] = num; 							
					}
				int sumEven=0;
				int sumOdd=0;
				System.out.println("");
				for (int fred: displayNumbers)
					{
						if (fred%2==0)
							{
								sumEven+=fred;
								System.out.println(fred+" is an even number");
								
							}
						else
							{
								sumOdd+=fred;
								System.out.println(fred+" is an odd number");
							}
					}
				System.out.println("");
				System.out.println("The even numbers total is: "+sumEven);
				System.out.println("The odd numbers total is:"+sumOdd);

			}

	}
