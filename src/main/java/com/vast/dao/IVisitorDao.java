package com.vast.dao;

import com.vast.entity.Visitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IVisitorDao {
    void insert(Visitor visitor);
    List<Visitor> pagingSelect(Map<String,Integer> map);
    Visitor selectById(Long id);
    int count();
}
