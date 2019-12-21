package club.cvast.service.impl;

import club.cvast.dao.IVisitorDao;
import club.cvast.domain.Visitor;
import club.cvast.service.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VisitorServiceImpl implements IVisitorService {

    @Autowired
    private IVisitorDao visitorDao;

    @Override
    public Visitor selectById(Long id) {
        if (id==null||id==0){
            return null;
        }
        return visitorDao.selectById(id);
    }

    @Override
    public List<Visitor> pagingSelect(Integer index, Integer size) {
        if (index==null&&size==null){
            return null;
        }
        if (index==null||index<1){
            index=1;
        }
        if (size==null||size<1){
            size=10;
        }
        Map<String,Integer> page=new HashMap<>(2);
        //MySQl limit分页公式
        index=(index-1)*size;
        page.put("index",index);
        page.put("size",size);
        return visitorDao.pagingSelect(page);
    }

    @Override
    public void insert(Visitor visitor) {
        if (visitor==null){
            return;
        }
        visitorDao.insert(visitor);
    }

    @Override
    public int count() {
        return visitorDao.count();
    }
}
