package t18.app.impl;

import org.springframework.stereotype.Component;
import t18.app.Person;

@Component("NanaPiyo")
public class NanaPiyo implements Person {
    @Override
    public void profile() {
        System.out.println("七海雛（日語：七海ひな，1993年7月17日－），日本AV女優。出身於廣島縣廣島市。在當坐檯小姐時一位客人說她長得像AV明星明日花綺羅，因此也想成為一位AV女優。出道時的所屬事務所是シエロ（2019年4月-2020年4月），藝名是七瀨雛（七瀬ひな）。");
    }
}
