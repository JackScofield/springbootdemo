package com.example.demo.dao;

import com.example.demo.dao.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class StudentDao {

    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentById(int id){
        return studentMapper.getStudentById(id);
    }


    public List<Student> getStudentsByClassId(int classId){
        return studentMapper.getStudentsByClassId(classId);
    }

    public List<Student> getFilteredStudentsByClassId(int classId, String gender, boolean order){
        if(Objects.equals(gender, "male")){
            if(order){
                return studentMapper.getMaleStudentsByClassIdInIncreasingOrderOfAge(classId);
            }
            else{
                return studentMapper.getMaleStudentsByClassIdInDecreasingOrderOfAge(classId);
            }
        }
        else{
            if(order){
                return studentMapper.getFemaleStudentsByClassIdInIncreasingOrderOfAge(classId);
            }
            else{
                return studentMapper.getFemaleStudentsByClassIdInDecreasingOrderOfAge(classId);
            }
        }
    }



}
