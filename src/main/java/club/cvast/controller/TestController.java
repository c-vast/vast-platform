package club.cvast.controller;

import club.cvast.controller.base.BaseController;
import club.cvast.domain.Visitor;
import club.cvast.util.Result;
import club.cvast.util.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {



    @PostMapping("/test01")
    public Result test(int a){
        return Result.success();
    }


}
