package com.demo.designpattern.creational.factory.simple.store.impl;

import com.demo.designpattern.creational.factory.simple.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class GoodsCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws RuntimeException {
        log.info("请求参数[实物商品] => uId：{} commodityId：{} bizId：{} extMap：{}", uid, commodityId, bizId, extMap);
        log.info("测试结果[实物商品]：{}", true);
    }
}
