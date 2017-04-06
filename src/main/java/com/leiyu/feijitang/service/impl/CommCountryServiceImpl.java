package com.leiyu.feijitang.service.impl;

import com.leiyu.feijitang.dao.IBaseDao;
import com.leiyu.feijitang.mapper.CommCountryMapper;
import com.leiyu.feijitang.service.ICommCountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wh on 2017/4/3.
 */
@Service
public class CommCountryServiceImpl extends AbstractService implements ICommCountryService{

    @Autowired
    CommCountryMapper commCountryMapper;

    @Override
    public IBaseDao getDao() {
        return this.commCountryMapper;
    }
}
