package Jan_14.Object;

/*
    Object 클래스 - 자바의 모든 클래스의 최상위 부모 클래스
    모든 클래스가 Object를 상속받고 있다.
    -> Object 클래스가 가진 메서드를 사용할 수 있다.
    1. toString()
    2. equals()
    3. hashCode()
*/

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Object 클래스의 toString(): 클래스 풀네임 + @ 해시코드
    // 오버라이딩 해서 객체의 상태(필드값) 정보를 문자열로 표현하게끔 재정의
    // - 로깅 목적, 디버깅 목적
    @Override
    public String toString(){
        String data = "name= " + this.name + ", age= " + this.age;
        return data;
    }

    @Override
    public boolean equals(Object o){
        // 모든 참조 자료형은 Object를 상속받고 있음
        // 매개변수로 Object를 전달받으면 모든 참조 자료형이
        // 업캐스팅된 상태로 넘어올 수 있다.
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ObjectStudent that = (ObjectStudent) o;
        // 필드값 비교 - 원시자료형 == 연산자
        boolean isSameAge = this.age == that.age;
        // 참조자료형 비교 - Object.equals
        boolean isSameName = Objects.equals(name, that.name);
        // = booelean isSameName = that.name.equals(name);
        return isSameName && isSameAge;
    }

    // equals()를 오버라이딩하면, 반드시 hashCode()도 오버라이딩 해야한다.
    // HashSet 등 해시기반 자료형에서 중복처리할 때 사용됨
    @Override
    public int hashCode(){
        int result = Objects.hash(name, age);
        return result;
    }
}
