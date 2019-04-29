package com.observerstu.impl;

import com.observerstu.dao.I_Observer;

public class StudentSuject implements I_Observer {
    private TeacherSubject teacherSubject;//订阅老师频道，方便以后取消
    private String name;
    //构造器注册到观察者里
    public StudentSuject(TeacherSubject t,String name){
        this.name=name;
        teacherSubject=t;
        t.addObject(this);
    }

    @Override
    public void update(String info) {
        System.out.println(name+"-获取作业："+info);
    }

}
