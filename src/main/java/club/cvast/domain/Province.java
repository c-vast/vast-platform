package club.cvast.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 省份数据模型
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class Province implements Serializable {
    private Integer id;
    private String code;
    private String name;
}
