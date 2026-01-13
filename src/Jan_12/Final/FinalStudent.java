package Jan_12.Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // 생성자 통해 필드가 초기화되는 코드가 클래스 내에 존재해야 함
    FinalStudent(String name, int studentId, int age){
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // 조회는 언제나 가능
    public String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

//    public void setStudentId(int studentId){
//        // final이기 때문에 setter로 재대입 불가능
//        this.studentId = studentId;
//    }
}
