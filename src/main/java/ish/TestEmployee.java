package ish;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {

  static class MyNameComp implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
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
        List<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.print(empMap);
        Map<String,List<Employee>> map=list.stream().collect(Collectors.groupingBy(Employee::getName));
        map.forEach((e1,e2)->System.out.println(e1+""+e2));
    }

}
