package club.cvast.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 *  API响应Result Json帮助类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class Result implements Serializable {
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

    public Result(int status, String message){
        this.status=status;
        this.message=message;
    }

    public Result(){
    }

    public Result(int status, String message, Object results){
        this.status=status;
        this.message=message;
        this.results=results;
    }

    public static Result success(){
        return new Result(200,"success");
    }

    public static Result success(Object results){
        return new Result(200,"success",results);
    }

    public static Result error(String message){
        return new Result(400,message);
    }

    public static Result exception(String message){
        return new Result(500,message);
    }

    public static Result notLogin(){
        return new Result(300,"未登录");
    }

    public static Result notLeave(){
        return new Result(100,"权限不足");
    }
}
