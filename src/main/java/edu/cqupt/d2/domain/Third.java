package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Third implements Serializable {
    private String  Third_Info_Type;
    private String  Third_Info_uid;
    private String  UID;
    private String  Third_Info_key;

    public Third() {
    }

    public Third(String third_Info_Type, String third_Info_uid, String UID, String third_Info_key) {
        Third_Info_Type = third_Info_Type;
        Third_Info_uid = third_Info_uid;
        this.UID = UID;
        Third_Info_key = third_Info_key;
    }

    public String getThird_Info_Type() {
        return Third_Info_Type;
    }

    public void setThird_Info_Type(String third_Info_Type) {
        Third_Info_Type = third_Info_Type;
    }

    public String getThird_Info_uid() {
        return Third_Info_uid;
    }

    public void setThird_Info_uid(String third_Info_uid) {
        Third_Info_uid = third_Info_uid;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getThird_Info_key() {
        return Third_Info_key;
    }

    public void setThird_Info_key(String third_Info_key) {
        Third_Info_key = third_Info_key;
    }

    @Override
    public String toString() {
        return "Third_login{" +
                "Third_Info_Type='" + Third_Info_Type + '\'' +
                ", Third_Info_uid='" + Third_Info_uid + '\'' +
                ", UID='" + UID + '\'' +
                ", Third_Info_key='" + Third_Info_key + '\'' +
                '}';
    }
}