package t13.app.impl;

import t13.app.Person;

public class SoraShiina implements Person {
    private String nickname;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int kissTime;

    @Override
    public void kiss() {
        kissTime += 1;

        System.out.println(nickname + "親你" + kissTime + "次");
    }
}
