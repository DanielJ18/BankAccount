package ssa;

public class Mainline {

    public static void main(String[] args) {

	// creating a checking and saving objects
	Account checking = new Account();
	Account savings = new Account();

	checking.setAccountId(100);
	

	checking.setDescription("My personal checking account");
	checking.setBalance(500.00);

	System.out.println(checking.getDescription() + "\nAccount ID: " + checking.getAccountId() + "\nInitial Balance: "
		+ checking.getBalance());

	System.out.println("---------------------------------------");

	// checking

	checking.deposit(200.00);
	checking.getBalance();

	checking.withdraw(600.00);
	checking.getBalance();

	checking.deposit(100.00);
	checking.withdraw(300.00);
	checking.getBalance();

	checking.withdraw(200.00);
	checking.getBalance();

	// Savings
	System.out.println("\n\n");

	savings.setAccountId(200);


	savings.setDescription("My personal savings account");
	savings.setBalance(1000.00);

	System.out.println(savings.getDescription() + "\nAccount ID: " + savings.getAccountId() + "\nInitial Balance: "
		+ savings.getBalance());

	System.out.println("---------------------------------------");

	savings.withdraw(750.00);
	savings.getBalance();

	savings.withdraw(250.00);
	savings.getBalance();

	savings.deposit(200.00);
	savings.getBalance();


    }


}
