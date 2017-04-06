package com.leiyu.feijitang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wh on 2017/4/3.
 */
@SpringBootApplication
@MapperScan("com.leiyu.feijitang.mapper")
public class FeiJiTangApp {

    public static void main(String[] args) {
        SpringApplication.run(FeiJiTangApp.class,args);
    }
}
