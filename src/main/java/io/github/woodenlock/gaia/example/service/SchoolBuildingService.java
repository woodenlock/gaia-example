package io.github.woodenlock.gaia.example.service;

import io.github.woodenlock.gaia.base.BaseSpringDataService;
import io.github.woodenlock.gaia.example.model.entity.SchoolBuilding;
import org.bson.types.ObjectId;

/**
 * 学校建筑service接口
 * @author woodenlock
 * @date 2022/1/22 16:53
 */
public interface SchoolBuildingService extends BaseSpringDataService<SchoolBuilding, ObjectId> {

}