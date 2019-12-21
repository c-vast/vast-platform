package club.cvast.config.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * 异常信息包装类
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class ErrorResponseEntity implements Serializable {

    private int status;
    private String message;

    public ErrorResponseEntity(int status, String message) {
        this.status=status;
        this.message=message;
    }
}