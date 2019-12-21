package club.cvast.util;

/**
 * HTTP相应参数状态码，消息
 */
public enum ResultCode {

	SUCCESS(200, "success"),
	ERROR(400,"error"),
	FAILURE(500,"failure");

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