package com.caopeng.pantacat.TEST;

import com.alibaba.fastjson.JSONObject;

public class test {

    public static void main(String[] args) {
        String str = "{'ordernumber':3,'status':0,'describeStr':'描述','imageUrl':1,'skipUrl1':2,'skipUrl2':3,'skipUrl3':4,'skipUrl4':5,'startDate':'2022-08-08T09:47:04','endDate':'2022-08-08T09:47:10','whiteList':6}";
        JSONObject jsonObj = JSONObject.parseObject(str);
        System.out.println(jsonObj.toJSONString());
    }
}
