package Jan_16.Challange._2;

public class BankAccount {
    public static void withdraw(int amount) {
        int balance = 10000;
        if(amount > balance){
            System.out.print("예외 발생: ");
            throw new InsufficientBalanceException(balance);
        }
    }

    public static void main(String[] args) {
        int amount = 50000;
        try{
            System.out.println("출금 시도: " + amount);
            withdraw(amount);
        } catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
