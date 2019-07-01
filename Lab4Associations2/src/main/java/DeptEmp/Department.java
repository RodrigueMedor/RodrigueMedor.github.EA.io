package DeptEmp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy="department", cascade = CascadeType.ALL)
    public List<Employee> list=new ArrayList<>();

    public Department(String name) {
        this.name = name;

    }

    public Department(){

    }
    public List<Employee> getEmployees() {
        return list;
    }
    public void addEmployees(Employee emp) {
        this.list.add(emp);
        emp.setDepartment(this);
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
}