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
public class CommCountry implements BaseEntity{
    private Integer rid;

    private String countrycode;

    private String countryname;

    private String countrynameE;

    private String language;

    private Date founddate;

    private String modifyuser;

    private Date modifytime;

}