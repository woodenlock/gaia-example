package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.base.BaseController;
import io.github.woodenlock.gaia.web.PageQuery;
import io.github.woodenlock.gaia.web.PageResult;
import io.github.woodenlock.gaia.web.RestResponse;

import java.io.Serializable;

/**
 * 自定义控制器模板
 *
 * @author woodenlock
 * @date 2022/1/23 15:24
 */
public class MyTemplateController<E extends Serializable, V extends Serializable> extends BaseController<E, V, V, V, Long> {

    @Override
    public RestResponse<V> query(Long aLong) {
        throw new UnsupportedOperationException("Unknown");
    }

    @Override
    public RestResponse<PageResult<V>> page(PageQuery<V> page) {
        throw new UnsupportedOperationException("Unknown");
    }

    @Override
    public RestResponse<Boolean> add(V operation) {
        throw new UnsupportedOperationException("Unknown");
    }

    @Override
    public RestResponse<Boolean> update(V operation) {
        throw new UnsupportedOperationException("Unknown");
    }

    @Override
    public RestResponse<Boolean> delete(Long aLong) {
        throw new UnsupportedOperationException("Unknown");
    }
}