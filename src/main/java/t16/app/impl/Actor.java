package t16.app.impl;

import t16.app.Person;

public class Actor implements Person {
    private String name;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public void introduce() {
        System.out.println("你好，我是"+name+"，"+info);
    }
}
