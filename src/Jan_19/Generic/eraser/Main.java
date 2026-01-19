package Jan_19.Generic.eraser;

public class Main {
    public static void main(String[] args) {
        /*
             제너릭 타입소거
             제너릭 타입은 런타임에 소거된다.
             + 오버로딩 되어있는 메서드 호출 시
            -> 내가 의도한 메서드 호출이 일어나지 않음
        */
        Box<Integer> box = new Box(0); // new로 생성된 실제 객체 타입은 Object!!
        box.print();

    }
}
