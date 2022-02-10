package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.base.BaseSpringDataController;
import io.github.woodenlock.gaia.example.model.vo.SearchKeyVO;
import io.github.woodenlock.gaia.web.RestResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 自定义搜索控制器基类
 *
 * @author woodenlock
 * @date 2022/1/22 20:07
 */
public abstract class BaseSearchController<E, V, O, S, K extends Serializable, ID extends Serializable> extends
    BaseSpringDataController<E, V, O, S, K, ID> {

    /**
     * 获取视图类类信息
     *
     * @return com.tanwin.matrix.server.common.SerializableFunction<E, V>
     */
    @NonNull
    protected abstract Class<V> getViewType();

    /**
     * 持久化映射对象的主键转换为对外的主键
     * @return java.util.function.Function<K, ID>
     */
    protected abstract Function<K, ID> convertEntityKey();

    /**
     * 计数
     * @param search 搜索对象
     * @return 符合的总数
     */
    @PostMapping("/searchCount")
    public RestResponse<Long> count(@RequestBody S search) {
        return new RestResponse<>(getService().selectCount(getSearch2EntityConvertor().apply(search)));
    }

    /**
     * 自定义搜索
     * @param search 搜索对象
     * @return 结果集
     */
    @PostMapping("/search")
    public RestResponse<List<V>> search(@RequestBody S search) {
        return new RestResponse<>(getService().selectSelective(getSearch2EntityConvertor().apply(search), getViewType()));
    }

    /**
     * 自定义搜索1
     * @param search 搜索对象
     * @return 结果集
     */
    @PostMapping("/search1")
    public RestResponse<List<V>> search1(@RequestBody SearchKeyVO<ID> search) {
        String[] array = new String[]{};
        List<K> keys = search.getKeys().stream().map(convertKey()).collect(Collectors.toList());
        List<E> records = getService().selectSelectiveByIds(keys, search.getProps().toArray(array));
        return new RestResponse<>(records.stream().map(getEntity2ViewConvertor()).collect(Collectors.toList()));
    }

    /**
     * 自定义搜索2
     * @param search 搜索对象
     * @return 结果集
     */
    @PostMapping("/search2")
    public RestResponse<List<V>> search2(@RequestBody SearchKeyVO<ID> search) {
        String[] array = new String[]{};
        List<K> keys = search.getKeys().stream().map(convertKey()).collect(Collectors.toList());
        List<V> records = getService().selectSelectiveByIds(keys, getViewType(), search.getProps().toArray(array));
        return new RestResponse<>(records);
    }

    /**
     * 自定义搜索主键集合
     * @param search 搜索对象
     * @return 主键集合
     */
    @PostMapping("/searchKey")
    public RestResponse<List<ID>> searchKey(@RequestBody S search) {
        List<K> keys = getService().selectIdSelective(getSearch2EntityConvertor().apply(search));
        return new RestResponse<>(keys.stream().map(convertEntityKey()).collect(Collectors.toList()));
    }
}