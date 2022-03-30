package Banking_Operation_Project;

import java.util.Scanner;

public class BankAccount {
	
	int balance;
	String customer_name;
	String customer_account_number;
	
	BankAccount(String c_name,String c_accnum)
	{
		customer_name = c_name;
		customer_account_number = c_accnum;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
		     balance=balance+amount;
		     System.out.println(" ");
		}
	}
	
	void withdraw(int amount)
	{
		int withdraw = 0;
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("Transaction Successful : Please collect your amount");
			System.out.println("Updated balance:-->"+balance);
		}
		else
		{
			System.out.println("Transaction not Successful : Insufficient balance");
		}
		System.out.println(" ");
	}
	
	void transfer()
	{
		int transfer = 0;
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
		
	}
	
	void display()
	{
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("<------------Welcome to our Banking Application------------>");
		System.out.println("Welcome "+customer_name+"your A/c number is "+customer_account_number);
		System.out.println("\n");
		System.out.println("Enter the balance of Account:-->");
		balance=sc.nextInt();
		
		while(num!=5)
		{
			System.out.println("Press 1:-> Deposit ");
			System.out.println("Press 2:-> Withdraw ");
			System.out.println("Press 3:-> Transfer ");
			System.out.println("Press 4:-> Check Balance ");
			System.out.println("Press 5:-> Exit ");
			
			num=sc.nextInt();
			System.out.println("\n");
			
			switch(num)
			{
				case 1:
					System.out.println("Enter the amount for Deposite:-->");
					int deposit=sc.nextInt();
					System.out.println("Transaction successful : Your amount deposited successfully");
					System.out.println("Updated balance:-->"+balance);
					System.out.println("\n");
					break;
					
				case 2:
					System.out.println("Enter the amount for Withdraw:-->");
					int withdraw=sc.nextInt();
					System.out.println("\n");
					break;
					
				case 3:
					System.out.println("Enter the name of the A/c holder:-->");
					String name=sc.next();
					System.out.println("Enter the A/c number of  the A/c holder:-->");
					long acc_num=sc.nextLong();
					System.out.println("Enter the IFSC code of A/c holder's bank:-->");
					String code=sc.next();
					System.out.println("Enter the name of the bank:-->");
					String bank=sc.next();
					
					System.out.println("Enter the amount for Transfer:-->");
					int transfer=sc.nextInt();
					System.out.println("\n");
					break;
					
				case 4:
					System.out.println("Your updated A/c balance is:-->"+balance);
					System.out.println("\n");
					break;
					
				case 5:
					System.out.println("<--------Thank You ,  Visit Again-------->");
					System.exit(0);
					break;
				
				default :
					System.err.println(" Invalid option!!... Please select the correct option");
					System.out.println("\n");
					break;
					
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Soumon Munshi","3024548156");
		b1.display();

	}

}
