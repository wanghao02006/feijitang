package com.leiyu.feijitang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wh on 2017/4/3.
 */
@RestController
@Slf4j
public class IndexController {

    @RequestMapping(path = "/")
    public String index(){
        log.debug("abcdef");
        return "首页";
    }
}
