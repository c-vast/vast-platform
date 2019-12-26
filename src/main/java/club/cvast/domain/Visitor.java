package club.cvast.domain;



import club.cvast.config.validation.group.UpdateGroup;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class Visitor implements Serializable {
    @NotNull(message = "id不能为空",groups = UpdateGroup.class)
    @Min(message = "id必须为大于0的数字",value = 0,groups = UpdateGroup.class)
    private Long id;

    @NotBlank(message = "Ip地址不能为空")
    private String visitorIp;

    @NotBlank(message = "Url地址不能为空")
    private String requestUrl;

    @NotNull(message = "创建时间不能为空")
    private Date createDate;

    @NotNull(message = "修改时间不能为空")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp == null ? null : visitorIp.trim();
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}