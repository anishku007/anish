package com.org.ish;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
  static class MyNameComp implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    }

    public static int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public static void main(String[] arg) {
        Employee emp1 = new Employee(1, "ak");
        Employee emp2 = new Employee(2, "bk");
        Employee emp3 = new Employee(2, "dk");
        Employee emp4 = new Employee(4, "mk");
        Employee emp5 = new Employee(5, "gk");

       Map<Employee, String> empMap = new TreeMap<>(new MyNameComp());
        empMap.put(emp1, "s1");
        empMap.put(emp2, "s2");
        //System.out.println("EmpMap" + empMap);
        List<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.forEach(System.out::println);
        Collections.sort(list, TestEmployee::compare);
        list.forEach(a -> {
           // System.out.println("list" + a.id + "=" + a.name);
        });
        List<Employee> emp1List1 = list.stream().filter(e -> e.name.startsWith("a")).sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        emp1List1.forEach(a -> {
           // System.out.println("empList" + a.id + "=" + a.name);
        });
        List<Employee> empList2 = list.stream().collect(Collectors.toList());
        empList2.forEach(a -> {
           // System.out.println("empList" + a.id + "=" + a.name);
        });
        Map<Integer, String> map = list.stream().filter(e -> e.getName().length() <= 2).collect(Collectors.toMap(Employee::getId, Employee::getName, (e1, e2) -> e1 + " " + e2));
        map.forEach((e1, e2) -> System.out.println(e1 + "=" + e2));
        List<String> stringList = new ArrayList<>();
        stringList.contains("1");
        stringList.add("2");
        String a = stringList.toString().join(",");
        System.out.println("aaaaa"+a);


    }

}
