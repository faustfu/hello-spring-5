// 1. 使用實體工廠方法創建 beans, 須預先實體化工廠 bean(可儲存狀態), 再定義工廠方法.
// 2. 被工廠創建的 beans 依然由 spring 管理其生命週期.
package t12;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import t12.app.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t12/beans.xml");
        var sora = ctx.getBean("sora", Person.class);
        var yua = ctx.getBean("yua", Person.class);
        var wife = ctx.getBean("sora", Person.class);

        sora.kiss();
        yua.kiss();
        wife.kiss();
    }
}
