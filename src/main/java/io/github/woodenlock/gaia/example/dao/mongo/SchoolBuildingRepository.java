package io.github.woodenlock.gaia.example.dao.mongo;

import io.github.woodenlock.gaia.example.model.entity.SchoolBuilding;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 学校建筑dao接口
 * @author woodenlock
 * @date 2022/1/22 16:51
 */
@Repository
public interface SchoolBuildingRepository extends MongoRepository<SchoolBuilding, ObjectId> {

}