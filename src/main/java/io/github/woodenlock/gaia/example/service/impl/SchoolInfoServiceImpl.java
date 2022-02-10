package io.github.woodenlock.gaia.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.woodenlock.gaia.example.dao.mapper.SchoolInfoMapper;
import io.github.woodenlock.gaia.example.model.entity.SchoolInfo;
import io.github.woodenlock.gaia.example.service.SchoolInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 服务类实现
 * @author woodenlock
 * @date 2022/1/22 16:26
 */
@Slf4j
@Service
public class SchoolInfoServiceImpl extends ServiceImpl<SchoolInfoMapper, SchoolInfo> implements SchoolInfoService {

}