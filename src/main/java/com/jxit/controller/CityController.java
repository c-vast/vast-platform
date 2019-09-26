package com.jxit.controller;

import com.jxit.service.ICityService;
import com.jxit.util.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市业务API控制器 Web Service
 * @since  2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@RestController
@RequestMapping("/api")
public class CityController {

    /**
     * 城市业务接口
     */
    @Autowired
    private ICityService cityService;

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 根据城市代码查询城市信息
     * @param code 城市代码
     * @return 城市信息
     */
    @GetMapping("/city/{code}")
    public AjaxResponse selectByCode(@PathVariable(name = "code") String code){
        return cityService.selectByCode(code);
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 查询全部城市信息（不进行分页）
     * @return 城市信息
     */
    @GetMapping("/city/all")
    public AjaxResponse selectAll(){
        return cityService.selectAll();
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 分页查询城市信息
     * @param index 当前页码
     * @param size 每页数量
     * @return 城市信息
     */
    @GetMapping("/city")
    public AjaxResponse pagingSelect(Integer index,Integer size){
        return cityService.pagingSelect(index,size);
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 根据城市名称模糊查询城市信息
     * @param name 城市名称
     * @return 城市信息
     */
    @GetMapping("/city/like")
    public AjaxResponse likeByName(String name){
        return cityService.likeByName(name);
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 根据省份代码查询所属城市信息
     * @param code 省份代码
     * @return 城市信息
     */
    @GetMapping("/city/province")
    public AjaxResponse selectByProvinceCode(String code){
        return cityService.selectByProvinceCode(code);
    }
}
