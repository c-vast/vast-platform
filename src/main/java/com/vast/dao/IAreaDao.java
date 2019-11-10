package com.vast.dao;

import com.vast.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 县、区域数据接口
 * @since  2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Mapper
public interface IAreaDao {
    Area selectByCode(String code);
    List<Area> selectAll();
    List<Area> pagingSelect(Map<String,Integer> map);
    List<Area> likeByName(String name);
    List<Area> selectByCityCode(String cityCode);
    int listCount();
}
