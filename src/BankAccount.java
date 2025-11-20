
public class BankAccount
{
    private double balance;
    private double rate;
    public BankAccount()
    {
        //определяем переменную
        balance = 0;
        rate = 0.1;
    }


    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    //Метод добавления денег на счет
    public void deposit(double amount)
    {
        balance += amount;
    }
    //Метод съема денег со счета
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    //Метод рассчета ожидаемых накоплений
    public double getWillbalance(double countmonth){
        double willbalance = balance;
        for (double i=0; i<countmonth; i++){
            willbalance += willbalance * rate;
        }
        return willbalance;
    }
    //возвращает хранимый баланс
    public double getBalance(){return balance;}
}