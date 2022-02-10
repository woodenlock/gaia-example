package io.github.woodenlock.gaia.example.model.vo;

import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 学校学院视图对象
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolCollegeVO implements Serializable {

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
     * 学院名称
     */
    private String name;

    /**
     * 学院编码
     */
    private String code;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 成立时间
     */
    private Long gmtFound;

    /**
     * 结束时间
     */
    private Long gmtEnd;

    /**
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 备注
     */
    private String remark;
}