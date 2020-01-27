package org.arc.aie;

import java.io.Serializable;

public class Employee implements Serializable {
    private Long id;
    private String name;
    private String email;
    private Double salary;
    private Long managerId;

    public Employee() {
    }

    public Employee(Long id, String name, String email, Double salary, Long managerId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.managerId = managerId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                ", managerId=" + managerId +
                '}';
    }
}
