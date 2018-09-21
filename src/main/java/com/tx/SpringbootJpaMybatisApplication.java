package com.tx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//扫描制定实体包
@EntityScan(basePackages = "com.tx.bean")
//扫描制定dao包
@EnableJpaRepositories(basePackages = "com.tx.repository")

@MapperScan("com.tx.mapper")
@SpringBootApplication
public class SpringbootJpaMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaMybatisApplication.class, args);
	}
}
