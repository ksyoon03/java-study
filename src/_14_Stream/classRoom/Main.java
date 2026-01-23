package _14_Stream.classRoom;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClassRoom> classes = List.of(
                new ClassRoom(
                        "1반",
                        List.of(
                            new Student("철수", 90, 80, 70),
                            new Student("영희", 85, 90, 95)
                        )
                ),
                new ClassRoom(
                        "2반",
                        List.of(
                                new Student("민수", 70, 75, 80),
                                new Student("복희", 100, 95, 90)
                        )
                )
        );

        /*
            [
                {
                    className: "1반",
                    students: [
                        {"철수", ~~}
                        {"영희", ~~
                    ]
                },
                {
                    className: "2반",
                    students: [
                        {"민수", ~~}
                        {"복희", ~~
                    ]
                }
            ]
         */

        // 그래프 탐색
        Student st1 = classes.get(0).getStudents().get(0);

        // 도전
        List<ClassRoomDto> dtos = classes.stream()
                .map(cr -> {
                    String name = cr.getClassName();
                    double avg = cr.getClassAvg();
                    return new ClassRoomDto(name, avg);
                })
                .toList();


    }
}
