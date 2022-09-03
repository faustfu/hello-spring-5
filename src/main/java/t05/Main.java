// 由外部使用自訂事件及監聽器
package t05;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t05.app.Deal;
import t05.app.event.*;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t05/beans.xml");
        var event = new DealEvent("t05", ctx.getBean("deal", Deal.class));

        ctx.publishEvent(event);
    }
}
