import java.util.Scanner;
public class bootCampArrayChallenge1
	{

		public static void main(String[] args)
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("User how many favorite sweets do you have?");
				int numberOfSweets=userInput.nextInt();
				String mySweets[]=new String[numberOfSweets]; 	
				Scanner userInput2= new Scanner(System.in);
				System.out.println("Please input what your favorite candies are one at a time:");
				for (int i=0; i<numberOfSweets; i++)
					{					
						String sweetName = userInput2.nextLine();
						mySweets[i] = sweetName; 							
					}
				System.out.println("");
				System.out.println("You're favorite sweets are: ");
				for (String fred: mySweets)
					{
						System.out.println(fred);
					}
				
				
			}

	}