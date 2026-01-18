# 문제

### **문제 : 은행 출금 예외 처리 (Exception 활용)**

계좌 잔액보다 많은 금액을 출금하려 할 때 발생하는 사용자 정의 예외를 만들고 처리하는 코드를 작성하세요.

- **요구사항**:
    1. 커스텀 예외 클래스 `InsufficientBalanceException`을 작성하세요. (부모 클래스는 `RuntimeException` 선택)
        - 생성자에서 "잔액이 부족합니다. (현재 잔액: [금액])" 메시지를 설정하세요.
    2. `BankAccount` 클래스에 `withdraw(int amount)` 메서드를 작성하세요.
        - 잔액(`balance`)보다 `amount`가 크면 `throw new InsufficientBalanceException(...)`을 발생시킵니다.
    3. `main` 메서드에서 `try-catch` 문을 사용하여 예외를 처리하고 메시지를 출력하세요.
- **출력 예시**:
    
    ```java
    출금 시도: 50000원
    예외 발생: 잔액이 부족합니다. (현재 잔액: 10000)
    ```