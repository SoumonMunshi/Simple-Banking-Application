package Banking_Operation_Project;


	
	import java.util.*;
	public class Banking_Aplication_Sumon {
		
		

		public static void main(String[] args) {
			int balance=10000,withdraw,deposit,transfer,num = 0;
			System.err.println("*********************");
			System.err.println("*             Welcome to our Banking Application              *");
			System.err.println("*********************");
					Scanner s=new Scanner(System.in);
					{
					System.out.println("      <<<<----:First you have to Register on our application:----->>>>");
					System.out.println("\n");
					System.out.println("Enter your first name :-->");
					String fname=s.next();
					System.out.println("Enter your last name :-->");
					String lname=s.next();
					System.out.println("Enter you phone number :-->");
					long pnum=s.nextLong();
					System.out.println("Enter your bank name :-->");
					String bank=s.next();
					System.out.println("Enter your branch name :-->");
					String branch=s.next();
					System.out.println("Enter you A/C number :-->");
					long acnum=s.nextLong();
					System.out.println("Enter the IFSC code of the bank:-->");
					String ifsccode=s.next();


					}
					Scanner sc=new Scanner(System.in);

	        String sp=" ";
	       System.out.println("Enter the Username");
	       String uname = sc.nextLine();
	       if(uname.contains(sp)) {
	    	   
	    	              System.err.println("Invalid Username");
	       return;
	       }
	              System.out.println("Enter the Password");
	       String upass = sc.nextLine();
	       if((upass.contains(sp))){
	           System.err.println("Invalid Password");
	           return;
	     
	       }
	       System.err.println(uname+" you are Registered Successfully");
	       System.out.println(uname+"  Please Enter Your Log_in Details");
	       System.out.println("Enter the Username");
	       String lname1 = sc.nextLine();
	       System.out.println("Enter the Password");
	       String lpass = sc.nextLine();

	       if(uname.equals(lname1) && upass.equals(lpass)){
		
				
			System.out.println("<===========Thank you "+uname+ ", you  are now successfully 'LOG_IN'  our aapplication===========>");
			
			//                   =======================LOGIN PART======================
			System.err.println("================>WELCOME OUR BANKING SYSTEM1<===========================");
		
				int number=0;
				{
				while(true)
				{	System.out.println("Please choose the given option:----->");
					System.err.println("Press 1:-> Withdraw ");
					System.err.println("Press 2:-> Deposit ");
					System.err.println("Press 3:-> Transfer ");
					System.err.println("Press 4:-> Check Balance ");
					System.err.println("Press 5:-> Exit ");
					


			     num=sc.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("Account_Balance:-->"+balance);

					System.out.println("Enter the amount for Withdraw:-->");
					withdraw=sc.nextInt();
					if(balance>=withdraw)
					{
						balance=balance-withdraw;
						System.err.println("Transaction Successful : Please collect your amount");
						System.out.println();
						System.out.println("Updated balance:-->"+balance);
					}
					else
					{
						System.err.println("Transaction not Successful : Insufficient balance");
					}
					System.out.println(" ");
					break;
					
				case 2:
					System.out.println("Account_Balance:-->"+balance);
					System.out.println("Enter the amount for Deposite:-->");
					deposit=sc.nextInt();
					balance=balance+deposit;
					System.err.println("Transaction successful : Your amount deposited successfully");
					System.out.println();
					System.out.println("Updated balance:-->"+balance);
					
					break;
					
				case 3:
					System.out.println("Account_Balance:-->"+balance);
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
						System.err.println("Balance is below 1000 : please deposit some amount"+"\n");
						
						System.out.println("Your updated A/c balance is:-->"+balance);
					}
					else
					{
						System.out.println("Your  A/c balance is:-->"+balance);
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
	       	
			
			


		}	}