package org.arc.aie;

import java.util.Comparator;

public class MyNameComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}

