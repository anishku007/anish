package org.arc.aie;

import java.util.*;
import java.util.stream.Collectors;

public class CodeTest {

    private static Employee getEmployeeById(Long id, Map<Long, Employee> empMap) {
        return empMap.get(id);
    }

    private static Employee removeEmployeeById(Long id, Map<Long, Employee> empMap) {
        return empMap.remove(id);
    }

    private static Employee getEmployeeByName(String name, Map<Long, Employee> empMap) throws Exception {
        Optional<Employee> emp = empMap.values().stream().filter(e -> e.getName().equals(name)).findAny();
        if (emp.isPresent()) {
            Long empId = emp.get().getId();
            return getEmployeeById(empId, empMap);
        }
        throw new Exception("Employee not found");
    }

    private static List<Employee> getEmployeesByManagerId(Long id, Map<Long, Employee> empMap) {
        return empMap.values().stream().filter(e -> e.getManagerId().equals(id)).collect(Collectors.toList());
    }

    private static Employee getEmployeeByPartialName(String name, Map<Long, Employee> empMap) throws Exception {
        Optional<Employee> emp = empMap.values().stream().filter(e -> e.getName().matches(name)).findAny();
        if (emp.isPresent()) {
            Long empId = emp.get().getId();
            return getEmployeeById(empId, empMap);
        }
        throw new Exception("Employee not found");
    }

    private static List<Employee> getTopNEmployeeBySalary(Long n, Map<Long, Employee> empMap) {
        List<Employee> emp = empMap.values().stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).limit(n).collect(Collectors.toList());
        return emp;
    }


    public static void main(String[] args) {
        Map<Long, Employee> empMap = new HashMap<>();
        Employee emp3 = new Employee(103l, "Dadish", "da@gmail.com", 4000.4, 102l);
        Employee emp4 = new Employee(104l, "Harry", "ha@gmail.com", 5674.9, 103l);
        Employee emp1 = new Employee(100l, "Akash", "ak@gmail.com", 2000.6, 102l);
        Employee emp2 = new Employee(102l, "Bikash", "bi@gmail.com", 3000.6, 102l);
        Employee emp5 = new Employee(105l, "Tom", "tom@gmail.com", 45632.6, 103l);

        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
        empMap.put(emp4.getId(), emp4);
        empMap.put(emp5.getId(), emp5);

        System.out.println("");
        System.out.println("Get Employee By Id :" + getEmployeeById(100l, empMap));
        Employee emp = null;
        try {
            emp = getEmployeeByName("Tom", empMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("Get Employee By Name :" + emp);
        try {
            emp = getEmployeeByPartialName("Tom", empMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("Get Employee By Partial Name :" + emp);
        System.out.println("");
        getEmployeesByManagerId(102l, empMap).forEach(System.out::println);
        System.out.println("");
        System.out.println("Remove Employee Employee :" + removeEmployeeById(102l, empMap));
        System.out.println("");
        getTopNEmployeeBySalary(3l, empMap).forEach(System.out::println);
    }
}

