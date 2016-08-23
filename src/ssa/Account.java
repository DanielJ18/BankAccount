package ssa;

public class Account {

    private int accountId;
    private String description;
    private double balance;


    // method to perform deposit
    public void deposit(double depositAmount) {

	this.balance += depositAmount;

	System.out.printf("Deposit Amount: %.2f Balance: %.2f\n", depositAmount, this.balance);
	System.out.println("---------------------------------------");

    }

    // method to perform withdraw
    public void withdraw(double withdrawAmount) {

	if (this.balance - withdrawAmount < 0) {

	    System.out.println("Insufficent funds." + "\nYour withdrawal of: " + withdrawAmount + " NOT approved. "
		    + "\nYour balance is: " + this.balance);
	    System.out.println("---------------------------------------");
	}

	else

	{
	    this.balance = this.balance - withdrawAmount;
	    System.out.printf("Withdrawal Amount: %.2f  Balance: %.2f\n", withdrawAmount, this.balance);

	    System.out.println("---------------------------------------");

	}

    }

    // setters and getter for accountId, description and balance

    public int getAccountId() {
	return accountId;
    }

    public void setAccountId(int accountId) {
	this.accountId = accountId;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }


}
