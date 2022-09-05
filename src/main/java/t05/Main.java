// 1. 由外部使用自訂事件及監聽器
// 2. 介面注入，實作某個介面，Spring 自動注入
// 3. 注入 Spring 容器參考，讓 beans 能使用框架提供的功能
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
