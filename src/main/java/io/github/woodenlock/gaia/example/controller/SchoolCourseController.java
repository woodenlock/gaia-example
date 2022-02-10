package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.example.model.entity.SchoolCourse;
import io.github.woodenlock.gaia.example.model.vo.SchoolCourseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学校课程控制器
 *
 * @author woodenlock
 * @date 2022/1/22 20:07
 */
@RestController
@RequestMapping("/api/school/course")
public class SchoolCourseController
    extends BaseStringSearchController<SchoolCourse, SchoolCourseVO, SchoolCourseVO, SchoolCourseVO> {

    @Override
    public Class<SchoolCourseVO> getViewType() {
        return SchoolCourseVO.class;
    }
}