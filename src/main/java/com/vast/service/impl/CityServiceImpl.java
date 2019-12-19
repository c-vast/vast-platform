package com.vast.service.impl;


import com.vast.dao.ICityDao;
import com.vast.entity.City;
import com.vast.service.ICityService;
import com.vast.util.Result;
import com.vast.util.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 城市业务接口实现类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Service
public class CityServiceImpl implements ICityService {

    /**
     * 城市数据操作接口
     */
    @Autowired
    private ICityDao cityDao;

    @Override
    public Result selectByCode(String code) {
        if (ValidateUtil.isEmpty(code)){
            return Result.error("数据异常：城市代码不能为空");
        }
        if (!ValidateUtil.isInteger(code)){
            return Result.error("数据异常：城市代码应该为纯数字");
        }
        City result = cityDao.selectByCode(code);
        if (result==null){
            return Result.error("数据异常：城市代码不存在");
        }
        return Result.success(result);
    }

    @Override
    public Result selectAll() {
        List<City> result = cityDao.selectAll();
        int count = cityDao.listCount();
        if (ValidateUtil.isEmpty(result)){
            return Result.error("数据异常：后台数据库查询无数据");
        }
        if (count<1){
            return Result.exception("服务器异常：后台数据库查询异常");
        }
        Map<String,Object> results=new HashMap<>(2);
        results.put("result",result);
        results.put("count",count);
        return Result.success(results);
    }

    @Override
    public Result pagingSelect(Integer index, Integer size) {
        if (index==null&&size==null){
            return selectAll();
        }
        if (index==null||index<1){
            index=1;
        }
        if (size==null||size<1){
            size=10;
        }
        Map<String,Integer> page=new HashMap<>(2);
        //MySQl limit分页公式
        index=(index-1)*size;
        page.put("index",index);
        page.put("size",size);
        List<City> result = cityDao.pagingSelect(page);
        int count = cityDao.listCount();
        if (ValidateUtil.isEmpty(result)){
            return Result.error("数据异常：后台数据库查询无数据");
        }
        if (count<1){
            return Result.exception("服务器异常：后台数据库查询异常");
        }
        Map<String,Object> results=new HashMap<>(2);
        results.put("result",result);
        results.put("count",count);
        return Result.success(results);
    }

    @Override
    public Result likeByName(String name) {
        if (ValidateUtil.isEmpty(name)){
            return Result.error("数据异常：城市名称不能为空");
        }
        List<City> result = cityDao.likeByName(name);
        if (ValidateUtil.isEmpty(result)){
            return Result.error("数据异常：数据库中与城市信息相似的数据不存在");
        }
        return Result.success(result);
    }

    @Override
    public Result selectByProvinceCode(String provinceCode) {
        if (ValidateUtil.isEmpty(provinceCode)){
            return Result.error("数据异常：省份代码不能为空");
        }
        if (!ValidateUtil.isInteger(provinceCode)){
            return Result.error("数据异常：省份代码应该为纯数字");
        }
        List<City> result = cityDao.selectByProvinceCode(provinceCode);
        if (ValidateUtil.isEmpty(result)){
            return Result.error("数据异常：数据库中所属省份的城市数据不存在");
        }
        return Result.success(result);
    }
}
