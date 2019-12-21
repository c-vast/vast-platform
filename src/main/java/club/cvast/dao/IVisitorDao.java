package club.cvast.dao;

import club.cvast.domain.Visitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IVisitorDao {
    List<Visitor> pagingSelect(Map<String,Integer> map);
    Visitor selectById(Long id);
    int count();
    int deleteByPrimaryKey(Long id);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}
