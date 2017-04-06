package com.leiyu.feijitang.dao;

import com.leiyu.feijitang.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by wh on 2017/4/3.
 */
public interface IBaseDao<T extends BaseEntity> {
    int deleteByPrimaryKey(Serializable rid);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Serializable rid);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
