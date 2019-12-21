package club.cvast.dao;

import club.cvast.domain.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDepartmentDao {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}