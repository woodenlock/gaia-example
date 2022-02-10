package io.github.woodenlock.gaia.example.model.entity;

import io.github.woodenlock.gaia.annotation.DynamicModule;
import io.github.woodenlock.gaia.common.GenerateConst;
import lombok.Data;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 学校账户信息
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@DynamicModule(GenerateConst.Persistence.MONGODB)
@Data
public class SchoolAccount implements Serializable {

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
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 可用余额
     */
    private BigDecimal available;

    /**
     * 授信企业id
     */
    private Long creditorId;

    /**
     * 授信额度
     */
    private BigDecimal credit;

    /**
     * 授信余额
     */
    private Integer creditState;

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