package club.cvast.service.base;


import club.cvast.config.exception.ServicewException;
import club.cvast.util.Paging;
import club.cvast.util.PagingUtil;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {
    /**
     * 插入数据
     * @param record
     * @return
     */
    boolean insert(T record);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    T selectById(String id);

    /**
     * 条件查询 可带排序
     * @param param
     * @return
     */
    Paging<T> pagingSelect(PagingUtil<T> param);

    /**
     * 修改数据 根据主键
     * @param record
     * @return
     */
    boolean updateByPrimaryKey(T record);

    /**
     * 删除数据 根据主键
     * @param id
     * @return
     */
    boolean deleteByPrimaryKey(String id);
}
