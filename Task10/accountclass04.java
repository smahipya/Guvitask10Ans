package Task10;

public class accountclass04 {
	private double balance;

 
    public accountclass04() {
    	
        this.balance = 0.0;
    }

    public accountclass04(double initialBalance) {
       
        this.balance = initialBalance;
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public static void main(String[] args) {
        
    	accountclass04 account1 = new accountclass04();
        account1.deposit(1000); 
        account1.withdraw(500); 
        System.out.println("Current balance: " + account1.balance);

        
        accountclass04 account2 = new accountclass04(2000);
        account2.withdraw(250); 
        account2.deposit(1000); 
        System.out.println("Current balance: " + account2.balance);
    }

 

}
