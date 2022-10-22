package t19.app.impl;

import org.springframework.stereotype.Component;
import t19.app.Axe;
import t19.app.Person;

import javax.annotation.Resource;

@Component
public class Taiwanese implements Person {
    @Resource(name = "copperAxe")
    private Axe axe;

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}
