package com.example.facebookpractice.model;

public class Post {

    private int profileImage;
    private String userName;
    private String postTime;
    private String privacy;
    private String postText;
    private int postImage;
    private String likes;
    private String comments;
    private  static final int NO_IMAGE = -1;

    public Post(int profileImage, String userName, String postTime, String privacy, String postText, int postImage, String likes, String comments) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.postTime = postTime;
        this.privacy = privacy;
        this.postText = postText;
        this.postImage = postImage;
        this.likes = likes;
        this.comments = comments;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean hasImage(){
        return profileImage != NO_IMAGE;
    }

    public Boolean hasText(){
        if (postText != null)
            return true;
        else
            return false;
    }

}
