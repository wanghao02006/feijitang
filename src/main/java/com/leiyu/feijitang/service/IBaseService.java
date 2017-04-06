package com.leiyu.feijitang.service;

import com.leiyu.feijitang.dao.IBaseDao;
import com.leiyu.feijitang.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by wh on 2017/4/3.
 */
public interface IBaseService<T extends BaseEntity> {

    String insert(T record);

    String deleteByPrimaryKey(Serializable rid);

    String update(T record);

    T select(Serializable rid);

    IBaseDao getDao();
}
