package Banking_Operation_Project;
import java.util.*;
public class Banking_System {

	public static void main(String[] args) {
		int balance,withdraw,deposit,transfer,num = 0,fact=0;
		System.err.println("*******************************************************************");
		System.err.println("***             Welcome to our Banking Application              ***");
		System.err.println("*******************************************************************");
		System.out.println("\n");
		
		//            ====================REGISTRATION PART=====================
	 	//String space=" ";
		System.out.println("      <<<<----:First you have to Register on our application:----->>>>");
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name :-->");
		String fname=sc.next();
		System.out.println("Enter your last name :-->");
		String lname=sc.next();
		System.out.println("Enter you phone number :-->");
		long pnum=sc.nextLong();
		System.out.println("Enter your bank name :-->");
		String bank=sc.next();
		System.out.println("Enter your branch name :-->");
		String branch=sc.next();
		System.out.println("Enter you A/C number :-->");
		long acnum=sc.nextLong();
		System.out.println("Enter the IFSC code of the bank:-->");
		String ifsccode=sc.next();
	 //	String space=" ";

		System.out.println("Please enter the username-->");
		String username=sc.next();
		String space=" ";
		if((username.contains(space)))
		{   
			
	    		System.out.println("Invalid Username");
			/*fact=1;
			if(fact==1)
			{
				System.out.println("Invalid username");
			}
			else
			{
				System.out.println("Valid username");
				fact=0;
			}*/
	    		return;
		}
	
		
		System.out.println("Please enter the password:--> ");
		String upassword=sc.next();
		String space1=" ";
		if((upassword.contains(space1)))
		{
			System.out.println("Invalid Password");
			/*fact=1;
			if(fact==1)
			{
				System.out.println("Invalid Password");
			}
			else
			{
				System.out.println("Valid Password");
				fact=0;
			}*/
			return;
		}
	
		System.out.println("<===========Thank you "+username+ ", you  are now successfully Registered in our aapplication===========>");
		System.out.println("\n");
		
		//                   =======================LOGIN PART======================
		System.err.println("       <<<<----------Now you have to Login your account---------->>>>");

		int number=0;
		{
		while(number!=2)
		{
			System.out.println("presh 1:- Customer Login ");
			System.out.println("presh 2:- Customer Details ");
			number=sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("Please enter registered username-->");
				String logname=sc.next();
				System.out.println("Please enter registered password:--> ");
				String logpassword=sc.next();
				if(username.equals(logname) && upassword.equals(logpassword))
				{
					System.out.println("<=========Welcome "+logname+ ", you  are now successfully Logged in to your accuount==========>");
				}
				else
				{
					 System.out.println("<=========Sorry "+logname+ ", incorrect username or password!!.... please type valid username or password=========>");
				}
				System.out.println(" ");
				break;
				
			case 2:
				System.out.println("Your name is:-->"+fname+ lname+" <===> Phn no.-->"+pnum+" <===> Bank name:-->"+bank+" <===> A/c no.-->"+acnum+" <===> Branch name:-->"+branch+" <===>IFSC Code:-->"+ifsccode);
				break;
			}
			//System.exit(0);
		}
		
		
		System.out.println("\n");
		System.out.println("Enter the balance of Account:-->");
		balance=sc.nextInt();
		System.err.println("Please choose the given option:----->");
		
		while(num!=5)
		{
			System.err.println("Press 1:-> Withdraw ");
			System.err.println("Press 2:-> Deposit ");
			System.err.println("Press 3:-> Transfer ");
			System.err.println("Press 4:-> Check Balance ");
			System.err.println("Press 5:-> Exit ");
			
		num=sc.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("Enter the amount for Withdraw:-->");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.err.println("Transaction Successful : Please collect your amount");
					System.out.println("Updated balance:-->"+balance);
				}
				else
				{
					System.err.println("Transaction not Successful : Insufficient balance");
				}
				System.out.println(" ");
				break;
				
			case 2:
				System.out.println("Enter the amount for Deposite:-->");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.err.println("Transaction successful : Your amount deposited successfully");
				System.out.println("Updated balance:-->"+balance);
				System.out.println(" ");
				break;
				
			case 3:
				System.out.println("Enter the name of the A/c holder:-->");
				String name=sc.next();
				System.out.println("Enter the A/c number of  the A/c holder:-->");
				long acc_num=sc.nextLong();
				System.out.println("Enter the IFSC code of A/c holder's bank:-->");
				String code=sc.next();
				System.out.println("Enter the name of the bank:-->");
				String bank1=sc.next();
				
				System.out.println("Enter the amount for transfer:-->");
				transfer=sc.nextInt();
				if(transfer<=5000)
				{
					System.err.println("Done : Transfered Successful");
					balance=balance-transfer;
					System.out.println("Updated balance:-->"+balance);
				}
				else if(transfer>5000)
				{
					System.err.println("Transation Un-successful : due to limitation");
					System.out.println("Updated balance:-->"+balance);
				}
				System.out.println(" ");
				break;
			
			case 4:
				System.err.println("Please waiting sometime......");
				if(balance<1000)
				{
					System.err.println("Balance is below 1000 : please deposit some amount");
					System.out.println("Your updated A/c balance is:-->"+balance);
				}
				else
				{
					System.out.println("Your updated A/c balance is:-->"+balance);
				}
				System.out.println(" ");
				break;
			
			case 5:
				System.err.println("<--------Thank You ,  Visit Again-------->");
				System.exit(0);
				break;
			
			default :
				System.err.println(" Invalid option!!... Please select the correct option");
				System.out.println("\n");
				break;
		}
		}

	}
}
	}
	
