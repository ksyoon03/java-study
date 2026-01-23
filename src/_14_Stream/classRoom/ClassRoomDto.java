package _14_Stream.classRoom;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// dto: 데이터 전송을 위한 객체
public class ClassRoomDto {
    private String className;
    private double classAvg; // 학급 평균 점수

}
