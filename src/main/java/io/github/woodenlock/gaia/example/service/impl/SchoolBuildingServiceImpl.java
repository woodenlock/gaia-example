package io.github.woodenlock.gaia.example.service.impl;

import io.github.woodenlock.gaia.base.BaseMongodbServiceImpl;
import io.github.woodenlock.gaia.example.dao.mongo.SchoolBuildingRepository;
import io.github.woodenlock.gaia.example.model.entity.SchoolBuilding;
import io.github.woodenlock.gaia.example.service.SchoolBuildingService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

/**
 * 学校建筑service接口实现类
 * @author woodenlock
 * @date 2022/1/22 16:55
 */
@Service
public class SchoolBuildingServiceImpl extends BaseMongodbServiceImpl<SchoolBuildingRepository, SchoolBuilding, ObjectId>
    implements SchoolBuildingService {

}