package model2;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer studentId;
    private String first;     // first name
    private String last;      // last name
    private String email;     // email address
    private int section;

    public Student(Integer studentId,String first, String last, String email, int section) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.section = section;
        this.studentId = studentId;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public Integer getId() {
        return studentId;
    }

    public void setId(Integer id) {
        this.studentId = id;
    }
}
