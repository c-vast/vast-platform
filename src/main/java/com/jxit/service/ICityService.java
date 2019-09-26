package com.jxit.service;

import com.jxit.util.AjaxResponse;

/**
 * 城市对外业务接口
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
public interface ICityService {
    AjaxResponse selectByCode(String code);
    AjaxResponse selectAll();
    AjaxResponse pagingSelect(Integer index,Integer size);
    AjaxResponse likeByName(String name);

    /**
     * 根据省份代码查询所属的所有城市信息
     * @param provinceCode 省份代码
     * @return 城市信息
     */
    AjaxResponse selectByProvinceCode(String provinceCode);
}
