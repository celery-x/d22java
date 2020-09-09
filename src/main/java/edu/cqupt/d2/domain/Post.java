package edu.cqupt.d2.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Post implements Serializable {
    private double Post_No;
    private String User_Name;
    private String UID;
    private String Post_Headline;
    private String Post_Content;
    private String Post_Time;
    private byte[] Post_Data;

    private List<Comment2Post> comments;

    public Post() {
    }

    public double getPost_No() {
        return Post_No;
    }

    public void setPost_No(double post_No) {
        Post_No = post_No;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getPost_Headline() {
        return Post_Headline;
    }

    public void setPost_Headline(String post_Headline) {
        Post_Headline = post_Headline;
    }

    public String getPost_Content() {
        return Post_Content;
    }

    public void setPost_Content(String post_Content) {
        Post_Content = post_Content;
    }

    public String getPost_Time() {
        return Post_Time;
    }

    public void setPost_Time(String post_Time) {
        Post_Time = post_Time;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public List<Comment2Post> getComments() {
        return comments;
    }

    public void setComments(List<Comment2Post> comments) {
        this.comments = comments;
    }

    public byte[] getPost_Data() {
        return Post_Data;
    }

    public void setPost_Data(byte[] post_Data) {
        Post_Data = post_Data;
    }

    public Post(double post_No, String user_Name, String UID, String post_Headline, String post_Content, String post_Time, List<Comment2Post> comments) {
        Post_No = post_No;
        User_Name = user_Name;
        this.UID = UID;
        Post_Headline = post_Headline;
        Post_Content = post_Content;
        Post_Time = post_Time;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Post_No=" + Post_No +
                ", User_Name='" + User_Name + '\'' +
                ", UID='" + UID + '\'' +
                ", Post_Headline='" + Post_Headline + '\'' +
                ", Post_Content='" + Post_Content + '\'' +
                ", Post_Time='" + Post_Time + '\'' +
                ", Post_Data=" + Arrays.toString(Post_Data) +
                ", comments=" + comments +
                '}';
    }
}