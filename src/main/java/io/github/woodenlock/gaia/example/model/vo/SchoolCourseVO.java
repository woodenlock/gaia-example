package io.github.woodenlock.gaia.example.model.vo;

import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import io.github.woodenlock.gaia.example.model.entity.SchoolTeacher;
import lombok.Data;

import java.io.Serializable;

/**
 * 学校课程信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolCourseVO implements Serializable {

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
     * 学校教师id
     * @see SchoolTeacher#getId()
     */
    private Long schoolTeacherId;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程编码
     */
    private String code;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 是否必修
     */
    private Integer necessary;

    /**
     * 开始时间
     */
    private Long gmtStart;

    /**
     * 结束时间
     */
    private Long gmtEnd;

    /**
     * 授课地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 备注
     */
    private String remark;
}