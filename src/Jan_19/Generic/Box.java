package Jan_19.Generic;

// 타입 매개변수
// <T>, <K, V>, <K, V, E>
public class Box<T> {
    // 클래스명<T> -> 가상의 타입 T를 쓸 수 있다.
    private T item;

    public Box(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }
}
