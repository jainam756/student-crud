package com.example.studentcrud.model;
import jakarta.persistence.*;


@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rollNo;
    private String email;
    private String college;
    private String branch;

    // Constructors, getters, setters

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public String getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
