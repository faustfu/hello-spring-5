// 指定 beans 作用域為 singleton 或 prototype
package t06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t06/beans.xml");

        System.out.println("singleton)p1 == p1 ? " + (ctx.getBean("p1") == ctx.getBean("p1")));
        System.out.println("prototype)p2 == p2 ? " + (ctx.getBean("p2") == ctx.getBean("p2")));

        System.out.println(ctx.getBean("date"));
        Thread.sleep(1000);
        System.out.println(ctx.getBean("date"));
    }
}
