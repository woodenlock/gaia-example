package io.github.woodenlock.gaia.example.controller;

import io.github.woodenlock.gaia.base.BaseMyBatisPlusController;
import io.github.woodenlock.gaia.example.model.entity.SchoolAccount;
import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import io.github.woodenlock.gaia.example.model.vo.SchoolInfoVO;
import io.github.woodenlock.gaia.web.RestResponse;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 控制器
 * @author woodenlock
 * @date 2022/1/22 20:19
 */
@RestController
@RequestMapping("/api/school/info")
public class SchoolInfoController extends BaseMyBatisPlusController<SchoolInfo, SchoolInfoVO, SchoolInfoVO, SchoolInfoVO> {

    @Autowired
    private org.springframework.data.mongodb.repository.MongoRepository<SchoolAccount, ObjectId> schoolAccountRepository;

    /**
     * 查询学校的关联账号id集合
     * @param id 学校id
     * @return 关联账号id集合
     */
    @GetMapping("/account/{id}")
    public RestResponse<List<String>> test(@PathVariable Long id) {
        SchoolAccount search = new SchoolAccount();
        search.setSchoolId(id);
        List<SchoolAccount> accounts = schoolAccountRepository.findAll(Example.of(search));
        List<String> accountIds = accounts.stream().map(acc -> acc.getId().toHexString()).collect(Collectors.toList());

        return new RestResponse<>(accountIds);
    }
}