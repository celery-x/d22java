package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Comment2Article implements Serializable {
    private double C2A_No;
    private double Article_No;
    private String C2A_ID;
    private String C2A_Name;
    private String C2A_Content;
    private String C2A_ime;

    public Comment2Article() {
    }

    public Comment2Article(double c2A_No, double article_No, String c2A_ID, String c2A_Content, String c2A_ime) {
        C2A_No = c2A_No;
        Article_No = article_No;
        C2A_ID = c2A_ID;
        C2A_Content = c2A_Content;
        C2A_ime = c2A_ime;
    }

    public Comment2Article(double c2A_No, double article_No, String c2A_ID, String c2A_Name, String c2A_Content, String c2A_ime) {
        C2A_No = c2A_No;
        Article_No = article_No;
        C2A_ID = c2A_ID;
        C2A_Name = c2A_Name;
        C2A_Content = c2A_Content;
        C2A_ime = c2A_ime;
    }

    public double getC2A_No() {
        return C2A_No;
    }

    public void setC2A_No(double c2A_No) {
        C2A_No = c2A_No;
    }

    public double getArticle_No() {
        return Article_No;
    }

    public void setArticle_No(double article_No) {
        Article_No = article_No;
    }

    public String getC2A_ID() {
        return C2A_ID;
    }

    public void setC2A_ID(String c2A_ID) {
        C2A_ID = c2A_ID;
    }

    public String getC2A_Content() {
        return C2A_Content;
    }

    public void setC2A_Content(String c2A_Content) {
        C2A_Content = c2A_Content;
    }

    public String getC2A_ime() {
        return C2A_ime;
    }

    public void setC2A_ime(String c2A_ime) {
        C2A_ime = c2A_ime;
    }

    public String getC2A_Name() {
        return C2A_Name;
    }

    public void setC2A_Name(String c2A_Name) {
        C2A_Name = c2A_Name;
    }

    @Override
    public String toString() {
        return "Comment2Article{" +
                "C2A_No=" + C2A_No +
                ", Article_No=" + Article_No +
                ", C2A_ID='" + C2A_ID + '\'' +
                ", C2A_Name='" + C2A_Name + '\'' +
                ", C2A_Content='" + C2A_Content + '\'' +
                ", C2A_ime='" + C2A_ime + '\'' +
                '}';
    }
}