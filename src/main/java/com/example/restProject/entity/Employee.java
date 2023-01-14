package com.example.restProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 8)
    private String dni;
    @Column(nullable = false, length = 50)
    private String fullName;
    @Column(nullable = false, length = 70)
    private String address;
    @Column(nullable = false, length = 50)
    private String job;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false, length = 20)
    private String sex;
    @Column(nullable = false, length = 9, unique = true)
    private String phone;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false)
    private Double salary;


    public Employee() {
    }

    public Employee(Long id, String dni, String fullName, String address, String job, Integer age, String sex, String phone, String email, Double salary) {
        this.id = id;
        this.dni = dni;
        this.fullName = fullName;
        this.address = address;
        this.job = job;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
