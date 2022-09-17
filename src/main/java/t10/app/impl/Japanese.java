package t10.app.impl;

import t10.app.Person;

public class Japanese implements Person {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Japanese{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String say() {
        return "こんにちは";
    }
}
