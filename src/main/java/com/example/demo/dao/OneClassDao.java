package com.example.demo.dao;

import com.example.demo.model.OneClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.mapper.OneClassMapper;
@Component
public class OneClassDao {
    @Autowired
    private OneClassMapper oneClassMapper;

    public OneClass getOneClass(int id){
        return oneClassMapper.getOneClass(id);
    }
}
