public class Main
{
    public static void main(String[] args){
        BankAccount conta1 = new BankAccount();
        BankAccount conta2 = new BankAccount(100.00);
        BankAccount conta3 = new BankAccount(1_000.00);
        
        System.out.println(conta1.getBalance());
        conta1.withdraw(1_000);
        System.out.println(conta1.getBalance());
    }
}