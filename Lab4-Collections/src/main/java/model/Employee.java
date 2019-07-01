package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String designation;
    private double salary;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "emplo", orphanRemoval = true)
    Set<Laptop> employeeList  = new HashSet<>();

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void addLaptop(Laptop laptop){
        employeeList.add(laptop);
        laptop.setEmployee(this);
    }

//    public void removeLaptop(Laptop laptop){
//        employeeList.remove(laptop);
//        laptop.setEmployee(null);
//    }

    public Employee() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Laptop> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<Laptop> employeeList) {
        this.employeeList = employeeList;
    }


}
