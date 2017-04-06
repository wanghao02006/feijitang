package com.leiyu.feijitang.service.impl;

import com.leiyu.feijitang.dao.IBaseDao;
import com.leiyu.feijitang.mapper.CommZoneMapper;
import com.leiyu.feijitang.service.ICommZoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wh on 2017/4/3.
 */
@Service
//@Slf4j
public class CommZoneServiceImpl extends AbstractService implements ICommZoneService {

    @Autowired
    CommZoneMapper commZoneMapper;


    @Override
    public IBaseDao getDao() {
        return this.commZoneMapper;
    }
}
