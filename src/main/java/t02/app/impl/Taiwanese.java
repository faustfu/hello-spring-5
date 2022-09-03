package t02.app.impl;

import t02.app.Axe;
import t02.app.Person;

public class Taiwanese implements Person {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}
