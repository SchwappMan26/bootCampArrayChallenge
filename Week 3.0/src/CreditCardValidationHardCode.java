import java.util.Scanner;

public class CreditCardValidationHardCode
	{

		public static void main(String[] args)
			{
				long aa =0;
				long creditCardNumber[]=new long[16];
				Scanner userInput = new Scanner(System.in);
				System.out.println("User, input a potential credit card number(16 digits)");
				long creditNum = userInput.nextLong();

				long a= creditNum/10/10/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[0]=a;
				if ((a*2)>=10)
					{
						
						aa= (a*2)%10+1;
					}
				
				long b= creditNum/10/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[1]=b;
				
				long c= creditNum/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[2]=c;
				long cc=0;
				if ((c*2)>=10)
					{
						
						cc=(c*2)%10+1;
					}
				
				long d= creditNum/10/10/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[3]=d;
				
				long e= creditNum/10/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[4]=e;
				if ((e*2)>=10)
					{
						long ee=0;
						ee=e%10+1;
					}
				
				long f= creditNum/10/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[5]=f;
				
				long g= creditNum/10/10/10/10/10/10/10/10/10%10;
				creditCardNumber[6]=g;
				if ((g*2)>=10)
					{
						long gg=0;
						gg=g%10+1;
					}
				long h= creditNum/10/10/10/10/10/10/10/10%10;
				creditCardNumber[7]=h;
				
				long i= creditNum/10/10/10/10/10/10/10%10;
				creditCardNumber[8]=i;
				if ((i*2)>=10)
					{
						long ii=0;
						ii=i%10+1;
					}
				
				long j= creditNum/10/10/10/10/10/10%10;
				creditCardNumber[9]=j;
				
				long k= creditNum/10/10/10/10/10%10;
				creditCardNumber[10]=k;
				if ((k*2)>=10)
					{
						long kk=0;
						kk=k%10+1;
					}
				
				long l= creditNum/10/10/10/10%10;
				creditCardNumber[11]=l;
				
				long m= creditNum/10/10/10%10;
				creditCardNumber[12]=m;
				if ((m*2)>=10)
					{
						long mm=0;
						mm=m%10+1;
					}
				
				long n= creditNum/10/10%10;
				creditCardNumber[13]=n;
				
				long o= creditNum/10%10;
				creditCardNumber[14]=o;
				if ((o*2)>=10)
					{
						long oo=0;
						oo=o%10+1;
					}
				
				long p= creditNum%10;
				creditCardNumber[15]=p;
				
				System.out.println(aa);
			}

	}
