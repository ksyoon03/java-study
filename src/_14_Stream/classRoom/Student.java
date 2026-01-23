package _14_Stream.classRoom;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public double getAvg(){
        return (kor + eng + math) / 3.0;
    }
}
