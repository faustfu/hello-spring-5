package t11.app.impl;

import t11.app.Person;

public class SoraShiina implements Person {
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void say() {
        System.out.println("空空空");
    }
}
