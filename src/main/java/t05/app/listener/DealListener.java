package t05.app.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import t05.app.event.*;

public class DealListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (!(event instanceof DealEvent)) {
            System.out.println("Ignore other event " + event);
            return;
        }

        var dealEvent = (DealEvent)event;
        System.out.println(dealEvent.getDeal().make());
    }
}
