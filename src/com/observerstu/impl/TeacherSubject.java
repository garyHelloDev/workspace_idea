package com.observerstu.impl;

import com.observerstu.dao.I_Observer;
import com.observerstu.dao.I_Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 老师是实现主题，要做什么事情
 */
public class TeacherSubject implements I_Subject {
    private List<I_Observer> objList=new ArrayList<I_Observer>();
    private String info;//状态。

    @Override
    public void addObject(I_Observer obj) {
        objList.add(obj);
    }

    @Override
    public void deleteObject(I_Observer obj) {
        int j=objList.indexOf(obj);
        if(j>0)objList.remove(obj);
    }

    @Override
    public void notifyObject() {
        for(I_Observer  obj:objList){
            obj.update(info);
        }
    }
    /**
     * 最后我需要布置作业
     */
    public void setHomeWork(String info){
       this.info=info;
       System.out.println("作业："+info);
       this.notifyObject();
    }
}
