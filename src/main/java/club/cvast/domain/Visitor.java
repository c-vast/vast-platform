package club.cvast.domain;

import club.cvast.util.DateTimeUtil;
import club.cvast.util.SnowflakeIdUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 访客表
 */
@Data
public class Visitor implements Serializable {
    private Long id;
    private String visitorIp;
    private String requestUrl;
    private Date createDate;
    private Date updateDate;
    public Visitor(){
        this.id= SnowflakeIdUtil.generateId();
        this.createDate= DateTimeUtil.nowDate();
        this.updateDate= DateTimeUtil.nowDate();
    }
}
