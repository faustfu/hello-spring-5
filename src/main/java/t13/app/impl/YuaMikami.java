package t13.app.impl;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.lang.NonNull;
import t13.app.Person;

public class YuaMikami implements Person, BeanNameAware {
    private String nickname;

    private String id;

    @Override
    public void setBeanName(@NonNull String name) {
        id = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int kissTime;

    @Override
    public void kiss() {
        kissTime += 1;

        System.out.println(nickname + "(" + id + ")" + "偷親你" + kissTime + "次");
    }
}
