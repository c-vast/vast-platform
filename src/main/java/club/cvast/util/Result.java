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
    private Integer status;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object results;
    public Result(){}

    public void setResultCode(ResultCode code) {
        this.status = code.status();
        this.message = code.message();
    }
    public Result(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static Result success(Object results) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setResults(results);
        return result;
    }

    public static Result failure(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    public static Result failure(ResultCode resultCode, Object results) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setResults(results);
        return result;
    }
}
