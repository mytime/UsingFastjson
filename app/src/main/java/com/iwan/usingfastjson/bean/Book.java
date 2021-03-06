package com.iwan.usingfastjson.bean;

import android.nfc.Tag;

import java.util.ArrayList;

/**
 * Book实体类
 */
public class Book {
    //属性要和json数据对应
    private String title;
    private String publisher;
    private String summary;
    //Tag 需要定义新实体类
    private ArrayList<Tag> tags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }
}
