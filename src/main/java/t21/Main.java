package t21;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        var ctx = new ClassPathXmlApplicationContext("t21/beans.xml");
        System.out.println("Beans:"+java.util.Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
