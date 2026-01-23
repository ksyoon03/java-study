package _14_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Data;

// dto: data transfer object
// -> 데이터 전달만 수행
// 전달하고 싶은 데이터 정의
@AllArgsConstructor
@Data
public class StudentDto {
    private String name;
    private String major;
    private String grade; // 학점
}
