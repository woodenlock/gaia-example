package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.example.model.entity.SchoolStudent;
import io.github.woodenlock.gaia.example.model.vo.SchoolStudentVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学校学生控制器
 *
 * @author woodenlock
 * @date 2022/1/22 20:17
 */
@RestController
@RequestMapping("/api/school/student")
public class SchoolStudentController
    extends BaseStringSearchController<SchoolStudent, SchoolStudentVO, SchoolStudentVO, SchoolStudentVO> {

    @Override
    public Class<SchoolStudentVO> getViewType() {
        return SchoolStudentVO.class;
    }
}