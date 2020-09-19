package com.demo.designpattern.creational.factory.simple.store;

import java.util.Map;


public interface ICommodity {
    /**
     * 发奖接口
     * @param uid 用户ID
     * @param commodityId 奖品ID
     * @param bizId 业务ID
     * @param extMap 扩展字段
     * @throws RuntimeException 异常
     */
    void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap)
            throws RuntimeException;
}
