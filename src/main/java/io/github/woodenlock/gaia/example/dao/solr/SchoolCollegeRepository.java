package io.github.woodenlock.gaia.example.dao.solr;

import io.github.woodenlock.gaia.example.model.entity.SchoolCollege;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 学校学院dao接口
 * @author woodenlock
 * @date 2022/1/22 16:51
 */
@Repository
public interface SchoolCollegeRepository extends SolrCrudRepository<SchoolCollege, String> {

}