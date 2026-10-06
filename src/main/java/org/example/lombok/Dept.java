package org.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dept {

    int deptno;
    String dname;
    String loc;
}