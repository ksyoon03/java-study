# 문제

### **문제 : 카페 메뉴 주문 시스템 (Enum 활용)**

`CoffeeMenu`라는 Enum을 정의하고, 각 메뉴의 이름과 가격 정보를 관리하는 프로그램을 작성하세요.

- **요구사항**:
    1. Enum 이름: `CoffeeMenu`
    2. 상수: `AMERICANO`("아메리카노", 4000), `LATTE`("라떼", 4500), `MOCHA`("모카", 5000)
    3. 필드: 메뉴 이름(`String name`), 가격(`int price`) (모두 `private` 및 `final` 권장)
    4. 메서드: 주문 수량을 입력받아 총 가격을 반환하는 `calculatePrice(int count)` 메서드를 구현하세요.
- **출력 예시**:
    
    ```java
    주문 메뉴: 아메리카노
    주문 수량: 3잔
    총 결제 금액: 12000원
    ```