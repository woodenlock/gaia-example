package io.github.woodenlock.gaia.example.model.vo;

import io.github.woodenlock.gaia.example.model.entity.SchoolAddress;
import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 学校建筑信息 视图对象
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SchoolBuildingVO implements Serializable {

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
     * 备注
     */
    private String remark;
}