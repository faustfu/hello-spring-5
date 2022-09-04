package t05.app.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import t05.app.Deal;

import java.util.Date;
import java.util.Locale;

public class FutureDeal implements Deal, ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    @Override
    public String make() {
        return "以 $2000 價格買 10 顆 ETH 的一個月遠期期貨 at " + ctx.getMessage("now", new Object[]{new Date()}, Locale.getDefault(Locale.Category.FORMAT));
    }
}
