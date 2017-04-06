package com.leiyu.feijitang.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.leiyu.feijitang.dao.IBaseDao;
import com.leiyu.feijitang.model.BaseEntity;
import com.leiyu.feijitang.service.IBaseService;

import java.io.Serializable;

/**
 * Created by wh on 2017/4/3.
 */
public abstract class AbstractService implements IBaseService {
    @Override
    public String insert(BaseEntity record) {
        int resultInt = this.getDao().insertSelective(record);
        JSONObject result = new JSONObject();
        if(resultInt > 0){
            result.put("success",true);
            result.put("msg","成功");
        }else {
            result.put("success",false);
            result.put("msg","失败");
        }
        return result.toJSONString();
    }

    @Override
    public String deleteByPrimaryKey(Serializable rid) {
        int resultInt = this.getDao().deleteByPrimaryKey(rid);
        JSONObject result = new JSONObject();
        if(resultInt > 0){
            result.put("success",true);
            result.put("msg","删除成功");
        }else {
            result.put("success",false);
            result.put("msg","删除失败");
        }
        return result.toJSONString();
    }

    @Override
    public String update(BaseEntity record) {
        int resultInt = this.getDao().updateByPrimaryKeySelective(record);
        JSONObject result = new JSONObject();
        if(resultInt > 0){
            result.put("success",true);
            result.put("msg","修改成功");
        }else {
            result.put("success",false);
            result.put("msg","修改失败");
        }
        return result.toJSONString();
    }

    @Override
    public BaseEntity select(Serializable rid) {
        return this.getDao().selectByPrimaryKey(rid);
    }

}
