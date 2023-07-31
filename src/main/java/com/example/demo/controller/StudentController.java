package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<String> getStudentById(@PathVariable int id) {
        try {
            Student student = studentService.getStudentById(id);
            if (student != null) {
                return new ResponseEntity<>("ok, find Student", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred while retrieving student", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @RequestMapping(method = RequestMethod.GET,path = "/class/{classId}")
//    public List<Student> getStudentsByClassId(@PathVariable  int classId){
//        return studentService.getStudentsByClassId(classId);
//    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getFilteredStudents(@RequestParam int classId, String gender, boolean increasingOrderOfAge){
        try{
            List<Student> students = studentService.getFilteredStudentsByClassId(classId,gender,increasingOrderOfAge);
            if(!students.isEmpty()){
                return new ResponseEntity<>(students,HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
