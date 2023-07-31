package com.example.demo.dao.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student where id = #{id}")
    public Student getStudentById(int id);


    @Select("select * from student where classId = #{classId}")
    public List<Student> getStudentsByClassId(int classId);

    @Select("select * from student where classId = #{classId} AND gender = 'male' order by age asc")
    public List<Student> getMaleStudentsByClassIdInIncreasingOrderOfAge(int classId);

    @Select("select * from student where classId = #{classId} AND gender = 'female' order by age asc")
    public List<Student> getFemaleStudentsByClassIdInIncreasingOrderOfAge(int classId);

    @Select("select * from student where classId = #{classId} AND gender = 'male' order by age desc")
    public List<Student> getMaleStudentsByClassIdInDecreasingOrderOfAge(int classId);

    @Select("select * from student where classId = #{classId} AND gender = 'female' order by age desc")
    public List<Student> getFemaleStudentsByClassIdInDecreasingOrderOfAge(int classId);

}
