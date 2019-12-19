package com.vast.controller;

import com.vast.service.IAreaService;
import com.vast.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 县、区域业务API控制器 Web Service
 * @since  2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@RestController
@RequestMapping("/api")
public class AreaController {

    /**
     * 县、区域业务接口
     */
    @Autowired
    private IAreaService areaService;

    /**
     * @since 2019年9月23日17点10分
     * @apiNote 根据县、区域代码进行查询县、区域信息
     * @param code 县、区域代码
     * @return 县、区域信息
     */
    @GetMapping("/area/{code}")
    public Result selectByCode(@PathVariable(name = "code") String code){
        return areaService.selectByCode(code);
    }

    /**
     * @since 2019年9月23日17点10分
     * @apiNote 查询全部县、区域信息不进行分页查询
     * @return 县、区域信息
     */
    @GetMapping("/area/all")
    public Result selectAll(){
        return areaService.selectAll();
    }

    /**
     * @since 2019年9月23日17点10分
     * @apiNote 分页查询全部县、区域信息 若参数都为空将使用selectAll方法
     * @param index 当前页码
     * @param size 每页数量
     * @return 县、区域信息
     */
    @GetMapping("/area")
    public Result pagingSelect(Integer index, Integer size){
        return areaService.pagingSelect(index,size);
    }

    /**
     * @since 2019年9月23日17点10分
     * @apiNote 模糊查询县、区域名称
     * @param name 县、区域名称
     * @return 县、区域信息
     */
    @GetMapping("/area/like")
    public Result likeByName(String name){
        return areaService.likeByName(name);
    }

    /**
     * @since 2019年9月24日14点17分
     * @apiNote 根基城市代码查询所属县、区域信息
     * @param code 城市代码
     * @return 县、区域信息
     */
    @GetMapping("/area/city")
    public Result selectByCityCode(String code){
        return areaService.selectByCityCode(code);
    }
}
