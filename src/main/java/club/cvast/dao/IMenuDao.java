package club.cvast.dao;

import club.cvast.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMenuDao {
    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}