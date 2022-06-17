
/**
 * Uma conta bancaria possi um saldo que pode ser alterado por 
 * depositos e saques.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;

    /**
     * Constroi uma conta bancaria com saldo zero.
     */
    public BankAccount()
    {
        balance = 0.0;
    }
    
    /**
     * Constroi uma conta bancaria com saldo.
     */
    public BankAccount(double amount)
    {
        if(amount <= 0){
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        this.balance = amount;
    }

    /**
     * Obtem o saldo atual da conta bancaria
     *
     * @return    saldo atual
     */
    public double getBalance()
    {
        return this.balance;
    }
    
    /**
     * Deposita um valor na conta bancaria.
     * 
     * @param    amount valor a depositar
     * 
     */
    public void deposit(double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException(
            "O valor depositado deve ser positivo.");
        }
        this.balance = this.balance + amount;
    }
    
    /**
     * Retira uma valor da conta bancaria.
     * 
     * @param    amount valor a retirar
     */
    public void withdraw(double amount) {
        if (amount <= 0){
            throw new IllegalArgumentException(
            "O valor retirado deve ser maior que zero.");
        }
        if (this.balance < amount) {
            throw new IllegalArgumentException("Saldo insuficiente (withdraw)");
        }
        this.balance = this.balance - amount;
    }
    
    /**
     * Retira o saldo de uma conta e adiciona a outra
     */
    public void transferTo(BankAccount toAccount, double amount){
        if (this.balance >= amount) {
            throw new IllegalArgumentException("Saldo insuficiente (transferTo)");
        }
        if (toAccount == null){
            throw new IllegalArgumentException("A conta destino nao pode ser null");
        }
        if (amount <= 0){
            throw new IllegalArgumentException(
            "O valor retirado deve ser maior que zero.");
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
    }
}

