package t16.app.impl;

import t16.app.Person;

public class Man implements Person {
    private Person wife;

    public Person getWife() {
        return wife;
    }

    public void setWife(Person wife) {
        this.wife = wife;
    }

    @Override
    public void introduce() {
        System.out.println("哈哈，這週大老婆的自我介紹：");
        wife.introduce();
    }
}
