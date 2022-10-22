package t19.app.impl;

import org.springframework.stereotype.Component;
import t19.app.Axe;

@Component
public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "我不砍";
    }
}
