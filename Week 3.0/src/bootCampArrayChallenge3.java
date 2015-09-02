
public class bootCampArrayChallenge3
	{

		public static void main(String[] args)
			{
				int fiveRandomNumbers[]= new int [5];
				System.out.println("The five numbers are:");
				for (int i=0; i<5;i++)
					{
						fiveRandomNumbers[i]= ((int)(Math.random()*90)+10);	
					}
				System.out.println("The five random numbers are: ");
				for (int fred: fiveRandomNumbers)
					{
						System.out.println(fred);
					}
				
				System.out.println("The numbers in reverse are: ");
				for (int i= fiveRandomNumbers.length-1; i >=0; i--)
					{
						System.out.println(fiveRandomNumbers[i]); 
					}	
			}

	}
