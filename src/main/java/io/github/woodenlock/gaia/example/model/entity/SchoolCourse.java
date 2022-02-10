package io.github.woodenlock.gaia.example.model.entity;

import io.github.woodenlock.gaia.annotation.DynamicModule;
import io.github.woodenlock.gaia.annotation.GenerateComponent;
import io.github.woodenlock.gaia.common.GenerateConst;
import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * 学校课程信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
@SolrDocument(collection = "course")
@DynamicModule(GenerateConst.Persistence.SOLR)
@GenerateComponent(type = GenerateConst.Component.CONTROLLER, generated = false)
@GenerateComponent(type = GenerateConst.Component.VO, generated = false)
public class SchoolCourse implements Serializable {

    /**
     * id
     */
    @Id
    @Field
    private String id;

    /**
     * 学校id
     * @see SchoolInfo#getId()
     */
    @Field
    private Long schoolId;

    /**
     * 学校教师id
     * @see SchoolTeacher#getId()
     */
    @Field
    private Long schoolTeacherId;

    /**
     * 课程名称
     */
    @Field
    private String name;

    /**
     * 课程编码
     */
    @Field
    private String code;

    /**
     * 状态
     */
    @Field
    private Integer state;

    /**
     * 是否必修
     */
    @Field
    private Integer necessary;

    /**
     * 开始时间
     */
    @Field
    private Long gmtStart;

    /**
     * 结束时间
     */
    @Field
    private Long gmtEnd;

    /**
     * 授课地址
     */
    @Field
    private String address;

    /**
     * 创建时间
     */
    @Field
    private Long gmtCreate;

    /**
     * 备注
     */
    @Field
    private String remark;
}