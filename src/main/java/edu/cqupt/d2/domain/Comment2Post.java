package edu.cqupt.d2.domain;

import java.io.Serializable;
import java.util.List;

public class Comment2Post implements Serializable {
    private double C2P_No;
    private double Post_No;
    private String C2P_UID;
    private String C2P_Name;
    private String C2P_Content;
    private String C2P_Time;

    private List<Reply2Comment> comments;

    public Comment2Post() {
    }


    public Comment2Post(double c2P_No, double post_No, String c2P_UID, String c2P_Name, String c2P_Content, String c2P_Time) {
        C2P_No = c2P_No;
        Post_No = post_No;
        C2P_UID = c2P_UID;
        C2P_Name = c2P_Name;
        C2P_Content = c2P_Content;
        C2P_Time = c2P_Time;
    }

    public Comment2Post(double c2P_No, double post_No, String c2P_UID, String c2P_Name, String c2P_Content, String c2P_Time, List<Reply2Comment> comments) {
        C2P_No = c2P_No;
        Post_No = post_No;
        C2P_UID = c2P_UID;
        C2P_Name = c2P_Name;
        C2P_Content = c2P_Content;
        C2P_Time = c2P_Time;
        this.comments = comments;
    }

    public double getC2P_No() {
        return C2P_No;
    }

    public void setC2P_No(double c2P_No) {
        C2P_No = c2P_No;
    }

    public double getPost_No() {
        return Post_No;
    }

    public void setPost_No(double post_No) {
        Post_No = post_No;
    }

    public String getC2P_UID() {
        return C2P_UID;
    }

    public void setC2P_UID(String c2P_UID) {
        C2P_UID = c2P_UID;
    }

    public String getC2P_Content() {
        return C2P_Content;
    }

    public void setC2P_Content(String c2P_Content) {
        C2P_Content = c2P_Content;
    }

    public String getC2P_Time() {
        return C2P_Time;
    }

    public void setC2P_Time(String c2P_Time) {
        C2P_Time = c2P_Time;
    }

    public String getC2P_Name() {
        return C2P_Name;
    }

    public void setC2P_Name(String c2P_Name) {
        C2P_Name = c2P_Name;
    }

    public List<Reply2Comment> getComments() {
        return comments;
    }

    public void setComments(List<Reply2Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Comment2Post{" +
                "C2P_No=" + C2P_No +
                ", Post_No=" + Post_No +
                ", C2P_UID='" + C2P_UID + '\'' +
                ", C2P_Name='" + C2P_Name + '\'' +
                ", C2P_Content='" + C2P_Content + '\'' +
                ", C2P_Time='" + C2P_Time + '\'' +
                ", comments=" + comments +
                '}';
    }
}