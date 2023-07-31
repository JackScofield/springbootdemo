package com.example.demo.model;

import java.util.List;

public class OneClass {
    private final int id;
    private String gradYear;
    private String major;
    private String department;
    private Faculty headTeacher;

    private List<Student> students;

    public int getId() {
        return id;
    }

    public OneClass(int id, String gradYear, String major, String department, Faculty headTeacher, List<Student> students) {
        this.id = id;
        this.gradYear = gradYear;
        this.major = major;
        this.department = department;
        this.headTeacher = headTeacher;
        this.students = students;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Faculty getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Faculty headTeacher) {
        this.headTeacher = headTeacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "gradYear='" + gradYear + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", headTeacher=" + headTeacher +
                ", students=" + students +
                '}';
    }
}
