# 문제

### 인터페이스와 다형성: `SmartPhone`

`Animal`과 `Swimable` 예제를 참고하여 스마트폰 기능을 조립해보세요.

1. **인터페이스 정의**:
    - `Camera`: `takePhoto()` 메서드 정의
    - `MusicPlayer`: `playMusic()` 메서드 정의
    - `Phone`: `call()` 메서드 정의
2. **구현 클래스 `SmartPhone` 생성**:
    - 위의 **3가지 인터페이스를 모두 구현(implements)** 합니다.
    - 각 메서드에서 적절한 출력문을 작성하세요.
3. **Main 클래스**:
    - `SmartPhone` 객체를 생성합니다.
    - 생성된 객체를 `Camera` 타입 변수에 담아 사진을 찍어보고, 다시 `Phone` 타입으로 캐스팅하여 전화를 걸어보세요.

```java
출력 결과

찰칵! 사진을 찍습니다.
빠바밤~ 음악을 틉니다.
따르릉~ 전화를 겁니다.
```