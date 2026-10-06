package org.example;

import org.example.lombok.HelloLombok;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        HelloLombok hello1 = new HelloLombok();
        hello1.setName("kim");
        hello1.setAge(40);
        hello1.setSsn("123-45");
        System.out.println(hello1.getName());
        System.out.println(hello1.getSsn());
        System.out.println(hello1);  // 자료형@메모리주소 였던 toString() 을 실제 객체 안에 있는 값으로 변환
        System.out.println(hello1.toString());
        System.out.println(hello1.equals("새로운 값"));

        HelloLombok hello2 = new HelloLombok("kim", 40, "12345");

        System.out.println(hello1.equals(hello2));
    }
}