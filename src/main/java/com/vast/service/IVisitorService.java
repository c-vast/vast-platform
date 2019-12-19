package com.vast.service;

import com.vast.entity.Visitor;

import java.util.List;

/**
 * 访客业务接口
 */
public interface IVisitorService {
     Visitor selectById(Long id);
     List<Visitor> pagingSelect(Integer index, Integer size);
     void insert(Visitor visitor);
     int count();
}
