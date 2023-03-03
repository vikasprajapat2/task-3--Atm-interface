import java.util.Scanner;
public class ATM 
{

	public static void main(String[] args) 
	{
		int balance =  120000, withdraw ,deposit, transfare;
		Scanner sc =  new Scanner (System.in);
		int pin = 123456;
		
		System.out.println("-------------------------");
		System.out.println(" WELL COME TO  JAVA BANK ");
		System.out.println("----------ATM------------");
		System.out.println("ENTER YOUR PIN: ");
		int entry = sc.nextInt();
		
		while(entry != pin )
		{
			System.out.println("\n INCORRECT YOUR PIN. TRY AGAIN. ");
			
			break;
		}
		while (true) 
			
		{
		    System.out.println("");
			System.out.println("Press 1 for withraw money");
			System.out.println("Press 2 for diposit monny");
			System.out.println("Press 3 for transfare money");
			System.out.println("Press 4 for exit ");
			int n  = sc.nextInt();
			switch(n) 
		    {
				case 1:
					System.out.println("Enter money withdrawn:");
					withdraw = sc.nextInt();
					if(balance >= withdraw)
					{
						balance = balance - withdraw;
						System.out.println("collect your money");
						System.out.println("balance:" + balance);
					}
					 else
		             {
		                 System.out.println("Insufficient Balance");
		             }
		             System.out.println("");
		             break;
		
		             case 2:
		             System.out.print("Enter money depositE:");
		             deposit = sc.nextInt();
		             balance = balance + deposit;
		             System.out.println("balance:" + balance);
		             System.out.println("Your Money has been successfully depsited");
		             System.out.println("");
		             break;
		
		             case 3:
		             System.out.println("Enter money for transfare:" );
		             transfare = sc.nextInt();
		             if(balance >= transfare )
		             {
		            	 balance = balance - transfare;
		            	 System.out.println("balance :" + balance );
		            	 System.out.println("MONEY TRANSFARE SUCCESFULLY! ");
		            	 
		             }
		             else
		             {
		            	 System.out.println("Insufficient balance");
		             }
		             System.out.println("");
		             break;
		
		             case 4:
		             System.out.println("EXIT! ");
		             System.out.println("------THANKYOU------");
		 			 System.out.println("----VISITE AGAIN----");
		             System.exit(0);
		    }
	   }
	}
}
	

