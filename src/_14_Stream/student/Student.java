package _14_Stream.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// 관계형 데이터베이스(RDB)에 있는 테이블과 1:1 매칭된 자바 클래스
// -> 엔티티(Entitiy)
public class Student {
    private String name;
    private String major;
    private int score;
    private String phone;
    private String email;

    // Student가 자기자신이 dto로 변환되는걸 담당하도록 작성
    public StudentDto toDto(){
        String grade;
        if(this.score >= 90) {
            grade = "A";
        } else if (this.score >= 80) {
            grade = "B";
        } else if (this.score >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return new StudentDto(this.name, this.major, grade);
    }
}
