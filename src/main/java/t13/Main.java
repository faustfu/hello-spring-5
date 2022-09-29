// 1. 使用 FactoryBean 介面, 不需指定工廠方法, spring 使用 getObject 作為工廠方法.
package t13;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t13.app.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t13/beans.xml");
        var sora = ctx.getBean("sora", Person.class);
        var yua = ctx.getBean("yua", Person.class);
        var wife = ctx.getBean("sora", Person.class);
        var scroll = ctx.getBean("getStaticField");

        sora.kiss();
        yua.kiss();
        wife.kiss();

        System.out.println("TYPE_SCROLL_SENSITIVE = " + scroll);
    }
}
