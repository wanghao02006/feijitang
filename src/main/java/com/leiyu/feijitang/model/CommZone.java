package com.leiyu.feijitang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class CommZone implements BaseEntity{
    private Integer rid;

    private String zonecode;

    private String zonename;

    private String parentcode;

    private Integer countryid;

    private String zipcode;

    private String tollcall;

    private Date createdate;

    private String alias;

    private String modifyuser;

    private Date modifydate;

}