package t16.app.impl;

import t16.app.Person;
import t16.app.Product;

public class Video implements Product {
    private String title;
    private String story;
    private Person mainActress;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Person getMainActress() {
        return mainActress;
    }

    public void setMainActress(Person mainActress) {
        this.mainActress = mainActress;
    }

    @Override
    public void brief() {
        System.out.println("片名："+title);
        System.out.println("內容："+story);
    }
}
