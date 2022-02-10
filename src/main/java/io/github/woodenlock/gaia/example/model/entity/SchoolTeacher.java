package io.github.woodenlock.gaia.example.model.entity;

import io.github.woodenlock.gaia.annotation.DynamicModule;
import io.github.woodenlock.gaia.annotation.GenerateComponent;
import io.github.woodenlock.gaia.common.GenerateConst;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * 学校教师信息
 *
 * @author woodenlock
 * @date 2022/1/22 14:08
 */
@Data
@SuppressWarnings("unused")
@Document(indexName = "school_teacher")
@DynamicModule(GenerateConst.Persistence.ELASTIC)
@GenerateComponent(type = GenerateConst.Component.CONTROLLER,
    generatorPath = "io.github.woodenlock.gaia.example.controller.MyControllerClassGenerator",
    registered = true, registrarPath = "io.github.woodenlock.gaia.registrar.DefaultBeanRegistrar")
public class SchoolTeacher implements Serializable {

    /**
     * id
     */
    private String id;

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