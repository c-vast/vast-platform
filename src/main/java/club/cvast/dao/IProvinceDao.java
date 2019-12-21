package club.cvast.dao;

import club.cvast.domain.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 省份数据接口
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Mapper
public interface IProvinceDao {

    /**
     * 根据省份代码精确查询省份信息
     * @param code 省份代码
     * @return 省份信息
     */
    Province selectByCode(String code);

    /**
     * 查询所有省份信息不分页
     * @return 所有省份信息
     */
    List<Province> selectAll();

    /**
     * 分页查询每页省份信息
     * @param map 当前页码 +每页数量
     * @return  每页省份信息
     */
    List<Province> pagingSelect(Map<String,Integer> map);

    /**
     * 根据省份名称模糊查询省份信息
     * @param name 省份名称
     * @return 省份信息
     */
    List<Province> likeByName(String name);

    /**
     * 查询列表总数
     * @return 数量
     */
    int listCount();

    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}
