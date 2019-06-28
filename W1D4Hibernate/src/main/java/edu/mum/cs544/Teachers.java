package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


@Table(name = "teachers")
public class Teachers {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = true)
    private String name;

    public Teachers() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}