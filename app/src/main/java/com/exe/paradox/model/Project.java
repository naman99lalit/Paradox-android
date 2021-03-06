package com.exe.paradox.model;

public class Project {
    String title, desc, link, drawablePath;

    public Project(String title, String desc, String link, String drawablePath) {
        this.title = title;
        this.desc = desc;
        this.link = link;
        this.drawablePath = drawablePath;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getLink() {
        return link;
    }

    public String getDrawablePath() {
        return drawablePath;
    }
}
