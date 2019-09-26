package com.jxit.service;


import com.jxit.util.AjaxResponse;

/**
 * 县、区域对外业务接口
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
public interface IAreaService {
    AjaxResponse selectByCode(String code);
    AjaxResponse selectAll();
    AjaxResponse pagingSelect(Integer index,Integer size);
    AjaxResponse likeByName(String name);

    /**
     * 根据城市代码查询所属所有县、区域信息
     * @param cityCode 城市代码
     * @return 区域信息
     */
    AjaxResponse selectByCityCode(String cityCode);
}
