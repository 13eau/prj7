package com.woniuxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.woniuxy.mapper")
public class Prj7Application {

	public static void main(String[] args) {
		SpringApplication.run(Prj7Application.class, args);
	}

}
