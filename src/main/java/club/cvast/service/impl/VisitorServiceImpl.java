package club.cvast.service.impl;

import club.cvast.config.exception.ServicewException;
import club.cvast.domain.Visitor;
import club.cvast.service.IVisitorService;
import club.cvast.service.base.BaseServiceImpl;
import club.cvast.util.Paging;
import club.cvast.util.PagingUtil;
import club.cvast.util.ResultCode;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl extends BaseServiceImpl<Visitor> implements IVisitorService<Visitor> {
    @Override
    public boolean insert(Visitor record) {
        if (record==null){
            throw new ServicewException(ResultCode.EXCEPION.status(),ResultCode.EXCEPION.message());
        }
        int insert = visitorDao.insert(record);
        return insert>0;
    }

    @Override
    public Visitor selectById(String id){
        Visitor visitor = visitorDao.selectByPrimaryKey(Long.parseLong(id));
        return visitor;
    }

    @Override
    public Paging<Visitor> pagingSelect(PagingUtil<Visitor> param) {
        return null;
    }


    @Override
    public boolean updateByPrimaryKey(Visitor record){
        return false;
    }

    @Override
    public boolean deleteByPrimaryKey(String id){
        return false;
    }

}
