package club.cvast.service.base;

import club.cvast.dao.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    /**
     * 日志
     */
    protected final Log Logger = LogFactory.getLog(this.getClass());
    @Autowired
    protected IAreaDao areaDao;
    @Autowired
    protected ICityDao cityDao;
    @Autowired
    protected IDepartmentDao departmentDao;
    @Autowired
    protected IMenuDao menuDao;
    @Autowired
    protected IOperationDao operationDao;
    @Autowired
    protected IProvinceDao provinceDao;
    @Autowired
    protected IRoleDao roleDao;
    @Autowired
    protected IUserInfoDao userInfoDao;
    @Autowired
    protected IUserRoleDao userRoleDao;
    @Autowired
    protected IVisitorDao visitorDao;
}
