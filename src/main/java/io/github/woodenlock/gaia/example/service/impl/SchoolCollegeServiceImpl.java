package io.github.woodenlock.gaia.example.service.impl;

import io.github.woodenlock.gaia.base.BaseSolrServiceImpl;
import io.github.woodenlock.gaia.example.dao.solr.SchoolCollegeRepository;
import io.github.woodenlock.gaia.example.model.entity.SchoolCollege;
import io.github.woodenlock.gaia.example.service.SchoolCollegeService;
import org.springframework.stereotype.Service;

/**
 * 学校学院service接口实现类
 * @author woodenlock
 * @date 2022/1/22 16:55
 */
@Service
public class SchoolCollegeServiceImpl extends BaseSolrServiceImpl<SchoolCollegeRepository, SchoolCollege, String>
    implements SchoolCollegeService {

}