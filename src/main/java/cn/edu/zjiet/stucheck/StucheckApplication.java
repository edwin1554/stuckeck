package cn.edu.zjiet.stucheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.zjiet.stucheck.mapper")
public class StucheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(StucheckApplication.class, args);
    }

}
