package t18.app.impl;

import org.springframework.stereotype.Component;
import t18.app.Person;

@Component
public class YumenoAika implements Person {
    @Override
    public void profile() {
        System.out.println("夢乃愛華出身於宮城縣，有一位姊姊。她中學一年級時身高已停止增長，高中初期胸部罩杯只有 B，但隨著「初體驗」和均衡飲食帶來的生理影響，三年級畢業那刻罩杯則升至 F，乳頭神經末梢亦變得敏感，最終跟胞姊一樣擁有 G 罩杯（2016年重量已達1700公克）；在校期間曾兼職業餘攝影會的水著模特兒，故此對幕前演出工作漸感興趣。2013年，她獲 AV 星探發掘，遂於同年3月拍攝首套形象影片而出道，5月則與日本成人影片發行商 S1 簽約拍攝第一部作品，並以「不平衡美少女」頭銜正式成為旗下專屬女優，且以「個子不高卻身材豐滿」的外表受到影迷歡迎。");
    }
}
