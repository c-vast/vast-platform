package club.cvast.service;


import club.cvast.util.Result;

/**
 * 省份对外业务接口
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
public interface IProvinceService {
    /**
     * 根据省份代码精确查询省份信息
     * @param code 省份代码
     * @return 省份信息
     */
    Result selectByCode(String code);

    /**
     * 查询所有省份信息不分页
     * @return 所有省份信息
     */
    Result selectAll();

    /**
     * 分页查询每页省份信息
     * @param index 当前页码
     * @param size 每页数量
     * @return  每页省份信息
     */
    Result pagingSelect(Integer index, Integer size);

    /**
     * 根据省份名称模糊查询省份信息
     * @param name 省份名称
     * @return 省份信息
     */
    Result likeByName(String name);
}
