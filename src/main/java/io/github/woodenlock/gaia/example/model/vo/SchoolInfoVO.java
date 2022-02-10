package io.github.woodenlock.gaia.example.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 学校基本信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolInfoVO implements Serializable {

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
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 备注
     */
    private String remark;
}