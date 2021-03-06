package club.cvast.config.exception;

/**
 *  自定义异常
 *
 * @author 1157168277@qq.com
 * @since 2019年9月23日17点12分
 * @version v1.0
 */
public class ServicewException extends RuntimeException {

    private int status;

    public ServicewException() {
        super();
    }

    public ServicewException(int status, String message) {
        super(message);
        this.setStatus(status);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}