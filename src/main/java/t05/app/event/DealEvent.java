package t05.app.event;

import org.springframework.context.ApplicationEvent;
import t05.app.Deal;

public class DealEvent extends ApplicationEvent {

    private Deal deal;

    public DealEvent(Object source) {
        super(source);
    }

    public DealEvent(Object source, Deal deal) {
        super(source);
        this.deal = deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Deal getDeal() {
        return deal;
    }
}
