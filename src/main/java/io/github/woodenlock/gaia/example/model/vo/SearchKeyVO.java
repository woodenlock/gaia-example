package io.github.woodenlock.gaia.example.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 主键查询视图
 *
 * @author woodenlock
 * @date 2022/1/22 16:08
 */
@Data
public class SearchKeyVO<K extends Serializable> {

    /**
     * 主键集合
     */
    private List<K> keys;

    /**
     * 属性集合
     */
    private List<String> props;
}