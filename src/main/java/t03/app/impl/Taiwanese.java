package t03.app.impl;

import t03.app.Axe;
import t03.app.Person;

public class Taiwanese implements Person {
    private Axe axe;

    public Taiwanese(Axe axe) { // 使用建構子注入依賴
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}
