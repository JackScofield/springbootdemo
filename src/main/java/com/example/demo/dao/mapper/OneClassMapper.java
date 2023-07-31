package com.example.demo.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.OneClass;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OneClassMapper {


    @Select("select * from class where id = #{id}")
    public OneClass getOneClass(int id);

}
