package org.yida.grid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.yida.grid")
@SpringBootApplication
public class GridApplication {

    public static void main(String[] args) {
        SpringApplication.run(GridApplication.class);
    }

}