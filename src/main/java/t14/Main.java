// 1. 實作 InitializingBean 介面, 可在 beans 創建後執行後續初始化.
// 2. 指定 bean 屬性 init-method, 也可在 beans 創建後執行後續初始化.
// 1. 實作 DisposableBean 介面, 可在 beans 銷毀前執行客製化行為.
// 2. 指定 bean 屬性 destroy-method, 也可在 beans 銷毀前執行客製化行為.
package t14;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t14.app.Person;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("t14/beans.xml");
        var yu = ctx.getBean("yu", Person.class);

        yu.profile();

        ctx.registerShutdownHook(); // Let spring framework close itself.
    }
}
