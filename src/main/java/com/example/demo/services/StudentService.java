package com.example.demo.services;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;


    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public List<Student> getStudentsByClassId(int classId){
        return studentDao.getStudentsByClassId(classId);
    }

    // increasingOrderOfAge = true => increasing order of age
    // increasingOrderOfAge = false => decreasing order of age
    public List<Student> getFilteredStudentsByClassId(int classId, String gender, boolean increasingOrderOfAge){
        return studentDao.getFilteredStudentsByClassId(classId,gender,increasingOrderOfAge);
    }


}
