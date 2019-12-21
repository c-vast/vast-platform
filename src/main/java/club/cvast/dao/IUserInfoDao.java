package club.cvast.dao;

import club.cvast.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserInfoDao {
    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}