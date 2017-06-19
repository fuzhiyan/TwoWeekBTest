package com.bwei.test.twoweekbtest;

/**
 * Created by Administrator on 2017/6/18.
 * time:
 * author:付智焱
 */

public class Bean {
    private int pic;
    private String title;
    private String news;

    public Bean(int pic, String title, String news) {
        this.pic = pic;
        this.title = title;
        this.news = news;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
