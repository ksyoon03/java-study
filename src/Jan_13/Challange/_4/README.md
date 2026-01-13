# 문제

### 문제: 만능 리모컨과 전자기기 (인터페이스 & 형변환)

다양한 전자기기를 하나의 리모컨(배열)으로 제어하고, 특정 기기만의 고유 기능을 사용해봅니다.

- **요구사항:**
    1. `RemoteControl` **인터페이스**를 정의하세요.
        - 메서드: `turnOn()` (전원 켜기)
    2. `TV`와 `AirConditioner` 클래스는 `RemoteControl`을 구현(implements)합니다.
        - `TV` 고유 메서드: `watchNetflix()` ("넷플릭스를 시청합니다.")
        - `AirConditioner` 고유 메서드: `turboCool()` ("파워 냉방을 시작합니다.")
    3. `Main` 클래스에서:
        - `RemoteControl` 타입의 배열에 `TV`와 `AirConditioner` 객체를 저장합니다 (**업캐스팅**).
        - 반복문(for)을 돌며 `turnOn()`을 호출합니다.
        - `instanceof`를 사용하여 객체가 `TV`라면 `watchNetflix()`를, `AirConditioner`라면 `turboCool()`을 호출하세요 (**다운캐스팅**).
- **출력 예시:**
    
    ```java
    TV 전원을 켭니다.
    넷플릭스를 시청합니다.
    ----------------
    에어컨 전원을 켭니다.
    파워 냉방을 시작합니다.
    ----------------
    ```