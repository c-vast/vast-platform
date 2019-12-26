package club.cvast.controller.base;

import club.cvast.domain.Visitor;
import club.cvast.service.IVisitorService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.validation.ValidationException;


public abstract class BaseController {
    protected final Log Logger = LogFactory.getLog(this.getClass());
    @Autowired
    protected IVisitorService<Visitor> visitorService;


    /**
     * 参数校验
     * @param bindingResult
     */
    protected void validData(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                throw new ValidationException(error.getDefaultMessage());
            }
        }
    }
}
