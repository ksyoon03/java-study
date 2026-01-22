package _8_NestedClass.inner;

import lombok.*;

@Builder // 빌더패턴 적용
//@Getter @Setter // getter, setter 생성
//@ToString // toString 오버라이딩
//@EqualsAndHashCode // equals, hasCode 오버라이딩
@AllArgsConstructor // 모든 필드 생성자
@NoArgsConstructor // final 필드 생성자
//@RequiredArgsConstructor // final 필드 생성자
@Data // getter, setter, toString, equals, hashCode, RequiredArgsConstructor 포함
public class LombokUser {
    private String username;
    private String name;
    private String address;

    // maven으로 프로젝트 만든 경우
    // 라이브러리 사용
    // maven repository에서 dependency 복사
}
