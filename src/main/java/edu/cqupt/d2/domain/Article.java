package edu.cqupt.d2.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Article implements Serializable {
    private double Article_No;
    private String User_Name;
    private String UID;
    private String Article_Content;
    private String Article_Headline;
    private String Article_Time;
    private byte[] Article_Data;

    private List<Comment2Article> comments;

    public double getArticle_No() {
        return Article_No;
    }

    public void setArticle_No(double article_No) {
        Article_No = article_No;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getArticle_Content() {
        return Article_Content;
    }

    public void setArticle_Content(String article_Content) {
        Article_Content = article_Content;
    }

    public String getArticle_Headline() {
        return Article_Headline;
    }

    public void setArticle_Headline(String article_Headline) {
        Article_Headline = article_Headline;
    }

    public String getArticle_Time() {
        return Article_Time;
    }

    public void setArticle_Time(String article_Time) {
        Article_Time = article_Time;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public List<Comment2Article> getComments() {
        return comments;
    }

    public void setComments(List<Comment2Article> comments) {
        this.comments = comments;
    }

    public byte[] getArticle_Data() {
        return Article_Data;
    }

    public void setArticle_Data(byte[] article_Data) {
        Article_Data = article_Data;
    }

    public Article() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Article(double article_No, String user_Name, String UID, String article_Content, String article_Headline, String article_Time, List<Comment2Article> comments) {
        Article_No = article_No;
        User_Name = user_Name;
        this.UID = UID;
        Article_Content = article_Content;
        Article_Headline = article_Headline;
        Article_Time = article_Time;
        this.comments = comments;
    }

    public Article(double article_No, String user_Name, String UID, String article_Content, String article_Headline, String article_Time, byte[] article_Data, List<Comment2Article> comments) {
        Article_No = article_No;
        User_Name = user_Name;
        this.UID = UID;
        Article_Content = article_Content;
        Article_Headline = article_Headline;
        Article_Time = article_Time;
        Article_Data = article_Data;
        this.comments = comments;
    }


    @Override
    public String toString() {
        return "Article{" +
                "Article_No=" + Article_No +
                ", User_Name='" + User_Name + '\'' +
                ", UID='" + UID + '\'' +
                ", Article_Content='" + Article_Content + '\'' +
                ", Article_Headline='" + Article_Headline + '\'' +
                ", Article_Time='" + Article_Time + '\'' +
                ", Article_Data=" + Arrays.toString(Article_Data) +
                ", comments=" + comments +
                '}';
    }
}