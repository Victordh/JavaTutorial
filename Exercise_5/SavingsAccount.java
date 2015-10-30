public class SavingsAccount
{
    // Properties of the class...
    private int balance;

    // Constructor of the class...
    public SavingsAccount()
    {
        balance = 0;
    }
    public SavingsAccount(int initialBalance)
    {
        balance = initialBalance;
    }

    // Methods of the class...
    public void greet()
    {
        System.out.println("Welcome!");
    }
    public void showBalance()
    {
        System.out.println("Balance: " + balance);
    }
    public void deposit(int howMuch)
    {
        if (howMuch < 0)
        {
            System.out.println("Sorry, you cannot deposit a negative amount. Maybe you would like to withdraw?");
        }
        else
        {
            balance = balance + howMuch;
        }
    }
    public void withdraw(int howMuch)
    {
        if (howMuch < 0)
        {
            System.out.println("Sorry, you cannot withdraw a negative amount. Maybe you would like to deposit?");
        }
        else
        {
            balance = balance - howMuch;
        }
    }
}
