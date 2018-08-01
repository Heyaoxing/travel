package com.travel;

import com.cxytiandi.elasticjob.annotation.EnableElasticJob;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableElasticJob
@MapperScan ("com.travel.dao")
public class TravelCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelCoreApplication.class, args);
	}
}
