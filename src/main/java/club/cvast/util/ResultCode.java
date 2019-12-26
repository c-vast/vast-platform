package club.cvast.util;

/**
 * HTTP相应参数状态码，消息
 */
public enum ResultCode {

	SUCCESS(200, "请求成功"),
	ERROR(400,"请求错误"),
	FAILURE(403,"请求失败"),
	EXCEPION(500,"服务器异常"),
	LOGIN_FAILURE(501,"登录失败,账号或密码错误"),
	PARAM_FOR_EMPTY(401,"所需参数不能为空"),
	PARAM_DIGITAL_ERROR(402,"所需参数必须为数字"),
	DATA_IS_NO(502,"查无数据"),
	SELECT_ERROR(503,"查询数据异常"),
	INSTER_ERROR(504,"插入数据异常"),
	UPDATE_ERROR(505,"更新数据异常"),
	DELETE_ERROR(506,"删除数据异常"),
	PARAM_ERROR(405,"参数转换失败"),
	API_ERROR(507,"接口异常");

	private Integer status;

	private String message;

	ResultCode(Integer status, String message) {
		this.status = status;
		this.message = message;
	}

	public Integer status() {
		return this.status;
	}

	public String message() {
		return this.message;
	}

	public static String getMessage(String name) {
		for (ResultCode item : ResultCode.values()) {
			if (item.name().equals(name)) {
				return item.message;
			}
		}
		return name;
	}

	public static Integer getStatus(String name) {
		for (ResultCode item : ResultCode.values()) {
			if (item.name().equals(name)) {
				return item.status;
			}
		}
		return null;
	}
}