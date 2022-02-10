package io.github.woodenlock.gaia.example.model.vo;

import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 学校学生信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
@SuppressWarnings("unused")
public class SchoolStudentVO implements Serializable {

    /**
     * id
     */
    private String id;

    /**
     * 学校id
     * @see SchoolInfo#getId()
     */
    private Long schoolId;

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