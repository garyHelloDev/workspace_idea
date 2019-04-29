package com.observerstu.dao;

/**
 * 主题接口
 */
public interface I_Subject {
    void addObject(I_Observer obj);
    void deleteObject(I_Observer obj);
    void notifyObject();
}
