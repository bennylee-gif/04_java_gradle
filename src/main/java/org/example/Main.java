package org.example;

import org.example.dbConn.DBUtil;
import org.example.lombok.Dept;
import org.example.lombok.HelloLombok;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws SQLException {

        HelloLombok hello1 = new HelloLombok("123-45"); // final 키워드로 선언된 ssn
        hello1.setName("kim");
        hello1.setAge(40);
        // hello1.setSsn("123-45"); // final 키워드로 선언된 변수를 수정 불가
        System.out.println(hello1.getName());
        System.out.println(hello1.getSsn());
        System.out.println(hello1);  // 자료형@메모리주소 였던 toString() 을 실제 객체 안에 있는 값으로 변환
        System.out.println(hello1.toString());
        System.out.println(hello1.equals("새로운 값"));

        HelloLombok hello2 = new HelloLombok("kim", 40, "123-45");

        System.out.println(hello1.equals(hello2));

        // ArrayList - 가변자료형 / db에서 조회한 dept 행이 몇개인지 모르니까

        ArrayList<Dept> deptList = new ArrayList<>();
        Connection conn = DBUtil.getConnection(); // DB에 접속하는 객체를 return 받아서 사용

        Statement stmt = conn.createStatement();
        String sql = "select * from dept";
        ResultSet rs  = stmt.executeQuery(sql);
        while (rs.next()) { // rs.next() 값이 있으면 true / 없으면 false 를 리턴
            int deptno = rs.getInt(1);
            String dname = rs.getString(2);
            String loc = rs.getString(3);

            Dept dept1 = new Dept(deptno, dname, loc);
            deptList.add(dept1);

        }

        System.out.println(deptList.get(0));
        System.out.println(deptList.get(1));

        DBUtil.close(rs, stmt, conn);



    }
}