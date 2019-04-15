package com.sv.preem.model;

public class Post extends AbstractModel {

    private String title;
    private String postInfo;
    private long userId;

    @Override
    public String toString() {
        return "Post{" + "title='" + title + '\'' + ", postInfo='" + postInfo + '\'' +
                ", userId=" + userId + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(String postInfo) {
        this.postInfo = postInfo;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
