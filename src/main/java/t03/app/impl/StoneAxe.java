package t03.app.impl;

import t03.app.Axe;

public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "我不砍";
    }
}
