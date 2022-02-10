package io.github.woodenlock.gaia.example.model.entity;

import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 学校建筑信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolBuilding implements Serializable {

    /**
     * id
     */
    private ObjectId id;

    /**
     * 学校id
     * @see SchoolInfo#getId()
     */
    private Long schoolId;

    /**
     * 学校id
     * @see SchoolAddress#getId()
     */
    private Long schoolAddressId;

    /**
     * 建筑类型
     */
    private Integer buildingType;

    /**
     * 造价
     */
    private BigDecimal price;

    /**
     * 占地面积
     */
    private BigDecimal floorArea;

    /**
     * 可用面积
     */
    private BigDecimal availableArea;

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