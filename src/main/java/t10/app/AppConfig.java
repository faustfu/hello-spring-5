package t10.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t10.app.impl.Japanese;

@Configuration // 宣告此物件為設定用途物件
public class AppConfig {
    @Value("篠田ゆう") String p1Name; // 對基礎型態變數賦值，供後續設定作業使用

    @Bean(name = "yu") // 宣告 Bean id 與 型態
    public Person p1() { // 使用程式設定 Bean 內容
        var p = new Japanese();

        p.setName(p1Name);

        return p;
    }
}
