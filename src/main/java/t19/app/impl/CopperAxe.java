package t19.app.impl;

import org.springframework.stereotype.Component;
import t19.app.Axe;

@Component
public class CopperAxe implements Axe {
    public String chop() {
        return "我砍";
    }
}
