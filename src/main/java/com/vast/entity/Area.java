package com.vast.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 县、区域数据模型
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class Area implements Serializable {
    private Integer id;
    private String code;
    private String name;
    private String cityCode;
}
