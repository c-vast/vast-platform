package club.cvast.dao;

import club.cvast.domain.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRoleDao {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}