package com.company.friver;

import netscape.security.UserTarget;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person = new Person();
        person.setSex(5);
        person.setAge(20);
        System.out.println("姓名:"+person.name+" 年龄:"+person.age+" 性别:"+person.getSex());
    }
}

class Person {
    String name;
    int age;
    int sex;

    Person() {
        name = "Jack";
        age = 18;
        sex = 1;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("年龄数据异常,默认为18");
            this.age = 18;
        } else
            this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        if (sex == 0 || sex == 1) {
            this.sex = sex;
        } else {
            System.out.println("输入性别异常,默认为男");
            this.sex = 1;
        }
    }

    public String getSex(){
//        System.out.println("age:"+age);
        return sex==1?"男":"女";
    }
}
