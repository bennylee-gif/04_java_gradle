package org.example.lombok;

import lombok.*;

//@Getter // 클래스명 위에 우리가 대신하려는 메서드의 어노테이션을 붙여줍니다.
//@Setter
//@ToString //외부에 공개되지 않아야 하는 변수에 대해서는 해당 변수 앞에 @ToString.Exclude 라는 어노테이션을 적어줍니다.
//@EqualsAndHashCode
@AllArgsConstructor // 모든 매개변수를 받는 생성자 생성
// // @NoArgsConstructor // 매개변수가 없는 default 생성자 생성
@RequiredArgsConstructor // final 키워드로 선언한 필수값을 받아서 객체를 생성하는 생성자
@Data //@Getter, Setter, ToString, EqualsAndHashCode, RequiredArgsConstructor 를 모두 포함

public class HelloLombok {

    private String name;
    private int age;

    //final 키워드 : 한번 만들어지면 절대 바뀌지 않을 값을 고정
    @ToString.Exclude
    private final String ssn;

    // HelloLombok(String name, int age) {
    //     this.name = name;
    //    this.age = age;
    // }


}