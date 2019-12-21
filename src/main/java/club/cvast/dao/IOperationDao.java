package club.cvast.dao;

import club.cvast.domain.Operation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOperationDao {
    int deleteByPrimaryKey(Integer btnId);

    int insert(Operation record);

    int insertSelective(Operation record);

    Operation selectByPrimaryKey(Integer btnId);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
}