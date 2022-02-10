package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.example.model.entity.SchoolCollege;
import io.github.woodenlock.gaia.example.model.vo.SchoolCollegeVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学校学院控制器
 * @author woodenlock
 * @date 2022/1/21 20:55
 */
@RestController
@RequestMapping("/api/school/college")
public class SchoolCollegeController extends
    BaseStringSearchController<SchoolCollege, SchoolCollegeVO, SchoolCollegeVO, SchoolCollegeVO> {

    @Override
    public Class<SchoolCollegeVO> getViewType() {
        return SchoolCollegeVO.class;
    }
}