package cn.ibona;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ibona.dao")
public class GenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenApplication.class, args);
	}
}
