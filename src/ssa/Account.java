package ssa;

public class Account {

    private int id;
    private String description;
    private double balance;
    static int count = 1;

    // Account account1 = new Account();
    // Account account2 = new Account();

    // constructors for class Account

    public Account() {
	this.balance = 0;
	this.id = count;
	count++;
    }

    public Account(String description) {
	this.description = description;
	this.id = count;
	count++;

    }

    public Account(int id, String description) {
	this.id = id;
	this.description = description;
	this.id = count;
	count++;

    }

    
    public String print()
    {
	String thisIsWhatIwantAndIwantItNow = "Account " + getId() + " balance is $" + getBalance();
	
	return thisIsWhatIwantAndIwantItNow;
    }

    // Transfer $$ method

    public void transferFrom(Account accountName, double transferAmount) {

	if (transferAmount <= accountName.getBalance()) {
	    accountName.withdraw(transferAmount);
	    this.deposit(transferAmount);
	}
	
	else
	    System.out.println("Insufficent funds. Enter the proper transfer amount.");

    }

    // method to perform deposit
    public void deposit(double depositAmount) {

	this.balance += depositAmount;

	System.out.printf("Accout: %d, deposit: %.2f balance: %.2f\n", getId(), depositAmount, this.balance);
	System.out.println("--------------------------------------------------");

    }

    // method to perform withdraw
    public void withdraw(double withdrawAmount) {

	if (this.balance - withdrawAmount < 0) {

	    System.out.println("Insufficent funds." + "\nYour withdrawal of: " + withdrawAmount + " NOT approved. "
		    + "\nYour balance is: " + this.balance);
	    System.out.println("--------------------------------------------------");
	}

	else

	{
	    this.balance = this.balance - withdrawAmount;
	    System.out.printf("Account: %d Withdrawal: %.2f  balance: %.2f\n", getId(), withdrawAmount, this.balance);

	    System.out.println("--------------------------------------------------");

	}

    }

    // setters and getter for accountId, description and balance

    public int getId() {
	return id;
    }

    private void setId(int accountId) {
	this.id = id;
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

    private void setBalance(double balance) {
	this.balance = balance;
    }

}
