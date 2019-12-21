package club.cvast.dao;

import club.cvast.domain.UserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}