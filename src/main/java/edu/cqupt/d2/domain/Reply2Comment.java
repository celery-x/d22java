package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Reply2Comment implements Serializable {
    private double R2C_No;
    private double R2C_Comment_No;
    private String Be_R2C_UID;
    private String Be_R2C_Name;
    private String R2C_UID;
    private String R2C_Name;
    private String R2C_Content;
    private String R2C_Time;


    public Reply2Comment() {
    }

    public Reply2Comment(double r2C_No, double r2C_Comment_No, String be_R2C_UID, String be_R2C_Name, String r2C_UID, String r2C_Name, String r2C_Content, String r2C_Time) {
        R2C_No = r2C_No;
        R2C_Comment_No = r2C_Comment_No;
        Be_R2C_UID = be_R2C_UID;
        Be_R2C_Name = be_R2C_Name;
        R2C_UID = r2C_UID;
        R2C_Name = r2C_Name;
        R2C_Content = r2C_Content;
        R2C_Time = r2C_Time;
    }

    public double getR2C_No() {
        return R2C_No;
    }

    public void setR2C_No(double r2C_No) {
        R2C_No = r2C_No;
    }

    public double getR2C_Comment_No() {
        return R2C_Comment_No;
    }

    public void setR2C_Comment_No(double r2C_Comment_No) {
        R2C_Comment_No = r2C_Comment_No;
    }

    public String getBe_R2C_UID() {
        return Be_R2C_UID;
    }

    public void setBe_R2C_UID(String be_R2C_UID) {
        Be_R2C_UID = be_R2C_UID;
    }

    public String getR2C_UID() {
        return R2C_UID;
    }

    public void setR2C_UID(String r2C_UID) {
        R2C_UID = r2C_UID;
    }

    public String getR2C_Content() {
        return R2C_Content;
    }

    public void setR2C_Content(String r2C_Content) {
        R2C_Content = r2C_Content;
    }

    public String getR2C_Time() {
        return R2C_Time;
    }

    public void setR2C_Time(String r2C_Time) {
        R2C_Time = r2C_Time;
    }

    public String getBe_R2C_Name() {
        return Be_R2C_Name;
    }

    public void setBe_R2C_Name(String be_R2C_Name) {
        Be_R2C_Name = be_R2C_Name;
    }

    public String getR2C_Name() {
        return R2C_Name;
    }

    public void setR2C_Name(String r2C_Name) {
        R2C_Name = r2C_Name;
    }

    @Override
    public String toString() {
        return "Reply2Comment{" +
                "R2C_No=" + R2C_No +
                ", R2C_Comment_No=" + R2C_Comment_No +
                ", Be_R2C_UID='" + Be_R2C_UID + '\'' +
                ", Be_R2C_Name='" + Be_R2C_Name + '\'' +
                ", R2C_UID='" + R2C_UID + '\'' +
                ", R2C_Name='" + R2C_Name + '\'' +
                ", R2C_Content='" + R2C_Content + '\'' +
                ", R2C_Time='" + R2C_Time + '\'' +
                '}';
    }
}