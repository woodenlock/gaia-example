package io.github.woodenlock.gaia.example.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 学校基本信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolInfo implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

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