package io.github.woodenlock.gaia.example.model.entity;

import io.github.woodenlock.gaia.annotation.DynamicModule;
import io.github.woodenlock.gaia.annotation.GenerateComponent;
import io.github.woodenlock.gaia.common.GenerateConst;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 学校学生信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
@Document(indexName = "school_student")
@DynamicModule(GenerateConst.Persistence.ELASTIC)
@GenerateComponent(type = GenerateConst.Component.CONTROLLER, generated = false)
@GenerateComponent(type = GenerateConst.Component.VO, generated = false)
public class SchoolStudent implements Serializable {

    /**
     * id
     */
    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    /**
     * 学校id
     * @see io.github.woodenlock.gaia.example.model.entity.SchoolInfo#getId()
     */
    @Field(type = FieldType.Long)
    private Long schoolId;

    /**
     * 名称
     */
    @Field(store = true, type = FieldType.Text)
    private String name;

    /**
     * 年龄
     */
    @Field(type = FieldType.Integer, index = false)
    private Integer age;

    /**
     * 状态
     */
    @Field(type = FieldType.Short)
    private Integer state;

    /**
     * 创建时间
     */
    @Field(type = FieldType.Long)
    private Long gmtCreate;

    /**
     * 备注
     */
    @Field(type = FieldType.Text)
    private String remark;
}