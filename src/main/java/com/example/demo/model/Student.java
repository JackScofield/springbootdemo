package com.example.demo.model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String gender;

    private int classId;
    private int age;
    public Student( int id, String name, String email, String gender, int classId, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.classId = classId;
        this.id = id;
        this.age = age;
    }

    public int getMyClass() {
        return classId;
    }

    public void setMyClass(int classId) {
        this.classId = classId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", myClass=" + classId +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
