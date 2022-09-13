package t08.app.impl;

import t08.app.Product;

public class Video implements Product {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String title;
    private String link;

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
