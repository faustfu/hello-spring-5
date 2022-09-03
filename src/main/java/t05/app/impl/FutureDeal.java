package t05.app.impl;

import t05.app.Deal;

public class FutureDeal implements Deal {
    @Override
    public String make() {
        return "以 $2000 價格買 10 顆 ETH 的一個月遠期期貨";
    }
}
