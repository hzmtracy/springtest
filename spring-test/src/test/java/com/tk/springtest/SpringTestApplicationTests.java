//package com.tk.springtest;
//
//import com.alibaba.fastjson.JSON;
//import com.tk.springtest.web.po.Department;
//import com.tk.springtest.web.po.DeptEmp;
//import com.tk.springtest.web.po.Employee;
//
//import org.assertj.core.util.Lists;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringTestApplicationTests {
////
////    @Test
////    public void contextLoads() {
////    }
//public static void main(String[] args) {
//    // product
////    Employee employee = Employee.builder()
////            .firstName("1")
////            .empNo(1)
////            .build();
////    System.out.println("employee: " +JSON.toJSON(employee));
////
////    // foot
////    Department department = Department.builder()
////            .a("7")
////            .build();
////    System.out.println("department: " +JSON.toJSON(department));
////
////    // view
////    DeptEmp deptEmp = DeptEmp.builder()
////            .b(employee.getFirstName())
////            .a(department.getA())
////            .build();
////    System.out.println("deptEmp: " +JSON.toJSON(deptEmp));
////
////    Map<Integer, Integer> j = new HashMap<>();
////
////    j.put(1,1);
////    System.out.println(j.get(2));
////    BigDecimal b1 =new BigDecimal(100);
////    BigDecimal b2  = new BigDecimal(10);
////    int groupCount = (int)Math
////            .floor(Double.parseDouble(
////                    String.valueOf(b1.multiply(b2))))/101;
////    System.out.println(groupCount);
////    double a = Math.floor(groupCount);
//    List<String> list = Lists.newArrayList();
//    list.add("A");
//    list.add("B");
////    List<String> listB = Lists.newArrayList();
////    listB.add("A");
////    list=list.stream().filter(t-> !listB.contains(t)).collect(Collectors.toList());
//    System.out.println(Arrays.toString(list.toArray()));
//
//}
//}
