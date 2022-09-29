package t12.app.impl;

import t12.app.Person;

public class YuaMikami implements Person {
    private String nickname;

    private int kissTime;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getKissTime() {
        return kissTime;
    }

    public void setKissTime(int kissTime) {
        this.kissTime = kissTime;
    }

    @Override
    public void kiss() {
        setKissTime(getKissTime()+1);

        System.out.println(nickname + "親你" + getKissTime() + "次");
    }
}
