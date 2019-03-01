package com.chinawyny.devops.autodeploy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(basePackages = "com.chinawyny.devops.autodeploy.core.dao", annotationClass = Repository.class)
public class AutoDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoDeployApplication.class, args);
	}
}
