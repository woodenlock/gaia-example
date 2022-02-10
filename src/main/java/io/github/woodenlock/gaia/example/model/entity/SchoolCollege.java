package io.github.woodenlock.gaia.example.model.entity;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * 学校学院信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
@SuppressWarnings("unused")
public class SchoolCollege implements Serializable {

    /**
     * id
     */
    @Id
    @Field
    private String id;

    /**
     * 学校id
     * @see io.github.woodenlock.gaia.example.model.entity.SchoolInfo#getId()
     */
    @Field
    private Long schoolId;

    /**
     * 学院名称
     */
    @Field
    private String name;

    /**
     * 学院编码
     */
    @Field
    private String code;

    /**
     * 状态
     */
    @Field
    private Integer state;

    /**
     * 成立时间
     */
    @Field
    private Long gmtFound;

    /**
     * 结束时间
     */
    @Field
    private Long gmtEnd;

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