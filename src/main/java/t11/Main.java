// 1. 使用靜態工廠方法創建 beans, 工廠不需預先實體化.
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
