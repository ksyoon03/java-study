package Jan_16.Challange._2;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(int balance) {
      super("잔액이 부족합니다. (현재 잔액: " + balance + "원)");
    }
}
