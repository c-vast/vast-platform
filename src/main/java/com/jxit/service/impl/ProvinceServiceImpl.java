package com.jxit.service.impl;


import com.jxit.dao.IProvinceDao;
import com.jxit.entity.Province;
import com.jxit.service.IProvinceService;
import com.jxit.util.AjaxResponse;
import com.jxit.util.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 省份业务接口实现类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Service
public class ProvinceServiceImpl implements IProvinceService {

    /**
     * 省份数据操作接口
     */
    @Autowired
    private IProvinceDao provinceDao;

    @Override
    public AjaxResponse selectByCode(String code) {
        if (ValidateUtil.isEmpty(code)){
            return AjaxResponse.error("数据异常：省份代码不能为空");
        }
        if (!ValidateUtil.isInteger(code)){
            return AjaxResponse.error("数据异常：省份代码应该为纯数字");
        }
        Province result = provinceDao.selectByCode(code);
        if (result==null){
            return AjaxResponse.error("数据异常：省份代码不存在");
        }
        return AjaxResponse.success(result);
    }

    @Override
    public AjaxResponse selectAll() {
        List<Province> result = provinceDao.selectAll();
        int count = provinceDao.listCount();
        if (ValidateUtil.isEmpty(result)){
            return AjaxResponse.error("数据异常：后台数据库查询无数据");
        }
        if (count<1){
            return AjaxResponse.exception("服务器异常：后台数据库查询异常");
        }
        Map<String,Object> results=new HashMap<>(2);
        results.put("result",result);
        results.put("count",count);
        return AjaxResponse.success(results);
    }

    @Override
    public AjaxResponse pagingSelect(Integer index, Integer size) {
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
        List<Province> result = provinceDao.pagingSelect(page);
        int count = provinceDao.listCount();
        if (ValidateUtil.isEmpty(result)){
            return AjaxResponse.error("数据异常：后台数据库查询无数据");
        }
        if (count<1){
            return AjaxResponse.exception("服务器异常：后台数据库查询异常");
        }
        Map<String,Object> results=new HashMap<>(2);
        results.put("result",result);
        results.put("count",count);
        return AjaxResponse.success(results);
    }

    @Override
    public AjaxResponse likeByName(String name) {
        if (ValidateUtil.isEmpty(name)){
            return AjaxResponse.error("数据异常：城市名称不能为空");
        }
        List<Province> result = provinceDao.likeByName(name);
        if (ValidateUtil.isEmpty(result)){
            return AjaxResponse.error("数据异常：数据库中与省份信息相似的数据不存在");
        }
        return AjaxResponse.success(result);
    }
}
