# 문제

### **문제: Object 클래스 오버라이딩 (toString, equals)**

책의 정보를 담는 `Book` 클래스를 작성하세요.

- **요구사항**:
    1. 필드: `title`(문자열), `isbn`(문자열)을 가집니다. (모두 `private`)
    2. `toString()`을 오버라이딩하여 "Book{title='제목', isbn='1234'}" 형식으로 반환하세요.
    3. `equals()`를 오버라이딩하여 `isbn`이 같으면 같은 책으로 판단하도록 만드세요.
- **출력 예시**:
    
    ```java
    Book{title='자바의 정석', isbn='1111'}
    true
    ```