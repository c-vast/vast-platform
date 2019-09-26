package com.jxit.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 城市数据模型
 * @since 2019年9月21日20点01分
 * @version 1.0
 * @author 1157168277@qq.com
 */
@Data
public class City implements Serializable {
    private Integer id;
    private String code;
    private String name;
    private String provinceCode;
}
