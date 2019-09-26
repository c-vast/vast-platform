package com.jxit.controller;

import com.jxit.service.IProvinceService;
import com.jxit.util.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 省份业务API控制器 Web Service
 * @since  2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@RestController
@RequestMapping("/api")
public class ProvinceController {

    /**
     * 省份业务接口
     */
    @Autowired
    private IProvinceService provinceService;

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 根据省份代码查询省份信息
     * @param code 省份代码
     * @return 省份信息
     */
    @GetMapping("/province/{code}")
    public AjaxResponse selectByCode(@PathVariable(name = "code") String code){
        return provinceService.selectByCode(code);
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 查询全部省份信息（不进行分页）
     * @return 省份信息
     */
    @GetMapping("/province/all")
    public AjaxResponse selectAll(){
        return provinceService.selectAll();
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 分页查询省份信息（若index和size都为空使用selectAll方法）
     * @param index 当前页码
     * @param size 每页数量
     * @return 省份信息
     */
    @GetMapping("/province")
    public AjaxResponse pagingSelect(Integer index,Integer size){
        return provinceService.pagingSelect(index, size);
    }

    /**
     * @since 2019年9月21日20点01分
     * @apiNote 根基省份名称进行模糊查询省份信息
     * @param name 省份名称
     * @return 省份信息
     */
    @GetMapping("/province/like")
    public AjaxResponse likeByName(String name){
        return provinceService.likeByName(name);
    }
}
