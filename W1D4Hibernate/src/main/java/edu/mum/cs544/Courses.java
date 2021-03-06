package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

import lombok.Data;


@Table(name = "courses")
public class Courses {

    @Id
    @Column(name = "\"id\"", nullable = false)
    private Integer id;
    @Column(name = "\"name\"", nullable = true)
    private String name;
    @Column(name = "\"teacher_id\"", nullable = false)
    private Integer teacherId;

    public Courses() {
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}