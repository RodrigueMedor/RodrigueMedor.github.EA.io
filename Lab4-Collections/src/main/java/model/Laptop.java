package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int yearModel;
    private String make;
    private String processor;
    @ManyToOne
    private Employee emplo;

    public Laptop(int yearModel, String make, String processor) {
        this.yearModel = yearModel;
        this.make = make;
        this.processor = processor;
        this.emplo = new Employee();
    }

    public Laptop() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Employee getEmployee() {
        return emplo;
    }

    public void setEmployee(Employee employee) {
        this.emplo = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return yearModel == laptop.yearModel &&
                id.equals(laptop.id) &&
                make.equals(laptop.make) &&
                processor.equals(laptop.processor) &&
                emplo.equals(laptop.emplo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yearModel, make, processor, emplo);
    }
}
