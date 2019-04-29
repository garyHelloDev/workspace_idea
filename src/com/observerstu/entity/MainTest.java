package com.observerstu.entity;

import com.observerstu.impl.StudentSuject;
import com.observerstu.impl.TeacherSubject;

/**
 * 测试了
 */
public class MainTest {
    public static void main(String[] args) {
        TeacherSubject teacherSubject=new TeacherSubject();
        StudentSuject s1=new StudentSuject(teacherSubject,"zhangsan");
        StudentSuject s2=new StudentSuject(teacherSubject,"lisi");
        StudentSuject s3=new StudentSuject(teacherSubject,"wangwu");
        for(int i=1;i<5;i++){
            System.out.println("现在开始发布第"+i+"道作业");
            teacherSubject.setHomeWork("作业"+i);
        }
    }
}
