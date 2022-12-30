package edu.global.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.global.ex.Mapper"})  // Mapper 읽기
@SpringBootApplication
public class MvcBoardExApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcBoardExApplication.class, args);
    }

}
