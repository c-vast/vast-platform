package club.cvast.domain;

import club.cvast.config.validation.group.UpdateGroup;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class City implements Serializable {
    @NotNull(message = "id不能为空",groups = UpdateGroup.class)
    @Min(message = "id必须为大于0的数字",value = 0,groups = UpdateGroup.class)
    private Integer id;

    @NotBlank(message = "城市代码不能为空")
    @Pattern(message = "城市代码必须为大于0的数字",regexp = "^[0-9]*$")
    private String code;

    @NotBlank(message = "城市名称不能为空")
    @Length(message = "城市名称长度范围应该2-16个之间",min=2, max=16)
    private String name;

    @NotBlank(message = "所属省份代码不能为空")
    @Pattern(message = "所属省份代码必须为大于0的数字",regexp = "^[0-9]*$")
    private String provinceCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }
}