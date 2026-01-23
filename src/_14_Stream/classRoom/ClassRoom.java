package _14_Stream.classRoom;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ClassRoom {
    private String className;
    private List<Student> students;

    public double getClassAvg(){
        if(students.isEmpty()){
            return 0.0;
        }

        double avgSum = 0.0;
        for(Student st : students){
            avgSum += st.getAvg();
        }

        return avgSum / students.size();
    }
}
