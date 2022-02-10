package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.example.model.entity.SchoolBuilding;
import io.github.woodenlock.gaia.example.model.vo.SchoolBuildingVO;
import io.github.woodenlock.gaia.util.DynamicModuleUtils;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

/**
 * 学校建筑控制器
 * @author woodenlock
 * @date 2022/1/21 20:55
 */
@RestController
@RequestMapping("/api/school/building")
public class SchoolBuildingController extends BaseSearchController<SchoolBuilding, SchoolBuildingVO, SchoolBuildingVO, SchoolBuildingVO, ObjectId, String> {
    @Override
    protected Function<String, ObjectId> convertKey() {
        return id -> DynamicModuleUtils.isBlank(id) ? null : new ObjectId(id.trim());
    }

    @Override
    protected Class<SchoolBuildingVO> getViewType() {
        return SchoolBuildingVO.class;
    }

    @Override
    protected Function<ObjectId, String> convertEntityKey() {
        return ObjectId::toHexString;
    }
}