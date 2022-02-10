package io.github.woodenlock.gaia.example;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import io.github.woodenlock.gaia.annotation.EnableDynamicModules;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * 启动类
 *
 * @author woodenlock
 * @date 2022/1/22 15:49
 */
@EnableDynamicModules
@SpringBootApplication
@MapperScan("io.github.woodenlock.gaia.example.dao.mapper")
@EnableMongoRepositories("io.github.woodenlock.gaia.example.dao.mongo")
@EnableSolrRepositories("io.github.woodenlock.gaia.example.dao.solr")
public class App {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}