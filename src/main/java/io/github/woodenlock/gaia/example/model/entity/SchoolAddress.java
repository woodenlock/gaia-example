package io.github.woodenlock.gaia.example.model.entity;

import io.github.woodenlock.gaia.annotation.DynamicModule;
import lombok.Data;

import java.io.Serializable;

/**
 * 学校地址信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@DynamicModule
@Data
public class SchoolAddress implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 学校id
     * @see io.github.woodenlock.gaia.example.model.entity.SchoolInfo#getId()
     */
    private Long schoolId;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 乡镇街道
     */
    private String street;

    /**
     * 详细地址
     */
    private String detail;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 是否删除
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 备注
     */
    private String remark;
}