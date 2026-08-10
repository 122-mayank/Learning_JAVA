public class Bank_Account_Encapsulation {
   public static void main(String args[]){

           BankAccount account =
                new BankAccount("Mayank", 1001, 5000);

        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        // Deposit
        account.deposit(2000);

        // Withdraw
        account.withdraw(1500);

        System.out.println("Final Balance: " + account.getBalance());

        // Invalid operations
        account.deposit(-500);
        account.withdraw(100000);
   }   
}


class BankAccount{

    //Private State

    private final String ownerName;
    private final int accountNumber;

    private double balance;

    //Constructor

    public BankAccount(String ownerName , 
    int accountNumber , double initialBalance){

        if(ownerName == null || ownerName.isBlank()){
         throw new IllegalArgumentException(
             "Owner name cannot be empty"
         );

        }

        if(initialBalance < 0 ){
             throw new IllegalArgumentException(
                "Initial Balance cannot be negative"
             );
        }


        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }


    //read only access
    public String getOwnerName(){
        return ownerName;
    }

    public int getAccountNumber(){
         return accountNumber;
    }

    public double getBalance(){
         return balance;
    }


    //Controlled Operations
    public void deposit(double amount){

        if(amount <= 0){
            System.out.println("Deposit amount must be greater than zero");
            return;
        }

        balance += amount;

        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount){

        if(amount <= 0){
            System.out.println("Withdrawl amount must be greater than zero");
            return;
        }
        
        if(amount > balance){
             System.out.println("Insufficient balance");
             return;
        }

        balance -= amount;

        System.out.println( "₹" + amount + " withdrawn successfully.");
          
    }


}