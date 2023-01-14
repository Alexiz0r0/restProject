package com.example.restProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 8)
    private String dni;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 20)
    private String city;
    @Column(nullable = false)
    private Integer age;
    @Column(unique = true, nullable = false, length = 9)
    private String phone;
    @Column(unique = true, nullable = false, length = 30)
    private String email;
    @Column(nullable = false, length = 20)
    private String sex;

    public Client() {
    }

    public Client(Long id, String dni, String name, String city, Integer age, String phone, String email, String sex) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.city = city;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
