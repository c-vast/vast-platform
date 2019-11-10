package com.vast.dao;

import com.vast.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 城市数据接口
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Mapper
public interface ICityDao {
    City selectByCode(String code);
    List<City> selectAll();
    List<City> pagingSelect(Map<String,Integer> map);
    List<City> likeByName(String name);

    List<City> selectByProvinceCode(String provinceCode);

    int listCount();
}
