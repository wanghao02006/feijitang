package com.leiyu.feijitang.controller;

import com.leiyu.feijitang.model.CommCountry;
import com.leiyu.feijitang.service.ICommCountryService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wh on 2017/4/3.
 */
@RestController
@RequestMapping(value = "/country")
public class CommCountryController {

    @Autowired
    ICommCountryService<CommCountry> commCountryService;

    @RequestMapping(value = "/index")
    public String index(){
        return "abc";
    }

    @ApiOperation(value = "新增国家",notes = "根据CommCountry增加国家信息")
    @ApiImplicitParam(name = "commCountry",value = "国家详细实体",required = true,dataType = "CommCountry")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String add(@RequestBody CommCountry commCountry){
        return commCountryService.insert(commCountry);
    }


    @ApiOperation(value = "删除国家",notes = "根据url的rid删除国家信息")
    @ApiImplicitParam(name = "rid",value = "国家id",required = true,dataType = "Integer")
    @RequestMapping(value = "/{rid}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer rid){
        return this.commCountryService.deleteByPrimaryKey(rid);
    }
    @ApiOperation(value = "更新国家信息",notes = "根据url中的rid修改国家信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "rid",value = "国家id",required = true,dataType = "Integer"),
            @ApiImplicitParam(name = "commCountry",value = "国家实体信息",required = true,dataType = "CommCountry")
    })

    @RequestMapping(value = "/{rid}",method = RequestMethod.PUT)
    public String update(@PathVariable Integer rid,@RequestBody CommCountry commCountry){
        CommCountry country = this.commCountryService.select(rid);
        country.setCountrycode(commCountry.getCountrycode());
        country.setCountryname(commCountry.getCountryname());
        country.setCountrynameE(commCountry.getCountrynameE());
        return this.commCountryService.update(commCountry);
    }

    @ApiOperation(value = "获取国家详细信息",notes = "根据路径中rid获取国家详细信息")
    @ApiImplicitParam(name = "rid",value = "国家id",required = true,dataType = "Integer")
    @RequestMapping(value = "/{rid}",method = RequestMethod.GET)
    public CommCountry get(@PathVariable Integer rid){
        return this.commCountryService.select(rid);
    }
}
