package io.github.woodenlock.gaia.example.controller;

import java.util.function.Function;

/**
 * 自定义字符串为主键的搜索控制器基类
 *
 * @author woodenlock
 * @date 2022/1/22 20:07
 */
public abstract class BaseStringSearchController<E, V, O, S> extends BaseSearchController<E, V, O, S, String, String> {
    @Override
    public Function<String, String> convertEntityKey() {
        return t -> t;
    }

    @Override
    protected Function<String, String> convertKey() {
        return t -> t;
    }
}