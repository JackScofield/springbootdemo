package com.example.demo.model;
public class Faculty {
    private String name;
    private int age;
    private int id;
    private String email;
    private String title;
    private String department;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getHeadTeacher() {
        return isHeadTeacher;
    }

    public void setHeadTeacher(Boolean headTeacher) {
        isHeadTeacher = headTeacher;
    }

    public Faculty(String name, int age, int id, String email, String title, String department, Boolean isHeadTeacher, OneClass myOneClass) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
        this.title = title;
        this.department = department;
        this.isHeadTeacher = isHeadTeacher;
        this.myOneClass = myOneClass;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", isHeadTeacher=" + isHeadTeacher +
                ", myClass=" + myOneClass +
                '}';
    }

    public OneClass getMyClass() {
        return myOneClass;
    }

    public void setMyClass(OneClass myOneClass) {
        this.myOneClass = myOneClass;
    }

    private Boolean isHeadTeacher;

    private OneClass myOneClass;


}
