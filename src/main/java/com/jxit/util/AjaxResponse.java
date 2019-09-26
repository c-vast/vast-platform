package com.jxit.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.IOException;
import java.io.Serializable;

/**
 *  Ajax响应Result Json帮助类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class AjaxResponse implements Serializable {
    /**
     * 服务端状态码
     */
    private int status;

    /**
     * 服务端响应消息
     */
    private String message;

    /**
     * 服务端响应结果集
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object results;

    public AjaxResponse(int status,String message){
        this.status=status;
        this.message=message;
    }

    public AjaxResponse(){
    }

    public AjaxResponse(int status,String message,Object results){
        this.status=status;
        this.message=message;
        this.results=results;
    }

    public static AjaxResponse success(){
        return new AjaxResponse(200,"success");
    }

    public static AjaxResponse success(Object results){
        return new AjaxResponse(200,"success",results);
    }

    public static AjaxResponse error(String message){
        return new AjaxResponse(400,message);
    }

    public static AjaxResponse exception(String message){
        return new AjaxResponse(500,message);
    }

    public static AjaxResponse notLogin(){
        return new AjaxResponse(300,"未登录");
    }

    public static AjaxResponse notLeave(){
        return new AjaxResponse(100,"权限不足");
    }
}
