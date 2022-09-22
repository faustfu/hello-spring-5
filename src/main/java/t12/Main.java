// 1. 使用實體工廠方法創建 beans, 須預先存在實體工廠 bean.
package t12;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t12.app.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t12/beans.xml");
        var sora = ctx.getBean("sora", Person.class);
        var yua = ctx.getBean("yua", Person.class);

        sora.say();
        yua.say();
    }
}
