// 1. 使用靜態方法創建 beans.
package t11;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t11.app.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t11/beans.xml");
        var sora = ctx.getBean("sora", Person.class);
        var yua = ctx.getBean("yua", Person.class);

        sora.say();
        yua.say();
    }
}
