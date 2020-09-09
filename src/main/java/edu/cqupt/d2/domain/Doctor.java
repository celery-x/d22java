package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Doctor implements Serializable {
    private String  Doctor_ID;
    private String  Doctor_UID;
    private String  Doctor_Name;
    private Integer Doctor_Age;
    private String  Doctor_Sex;
    private String  Doctor_Office;
    private String  Doctor_Mailbox;
    private String  Doctor_Phone;
    private String  Doctor_Degree;

    public Doctor() {
    }

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String doctor_ID) {
        Doctor_ID = doctor_ID;
    }

    public String getDoctor_UID() {
        return Doctor_UID;
    }

    public void setDoctor_UID(String doctor_UID) {
        Doctor_UID = doctor_UID;
    }

    public Integer getDoctor_Age() {
        return Doctor_Age;
    }

    public void setDoctor_Age(Integer doctor_Age) {
        Doctor_Age = doctor_Age;
    }

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        Doctor_Name = doctor_Name;
    }

    public String getDoctor_Sex() {
        return Doctor_Sex;
    }

    public void setDoctor_Sex(String doctor_Sex) {
        Doctor_Sex = doctor_Sex;
    }

    public String getDoctor_Office() {
        return Doctor_Office;
    }

    public void setDoctor_Office(String doctor_Office) {
        Doctor_Office = doctor_Office;
    }

    public String getDoctor_Mailbox() {
        return Doctor_Mailbox;
    }

    public void setDoctor_Mailbox(String doctor_Mailbox) {
        Doctor_Mailbox = doctor_Mailbox;
    }

    public String getDoctor_Phone() {
        return Doctor_Phone;
    }

    public void setDoctor_Phone(String doctor_Phone) {
        Doctor_Phone = doctor_Phone;
    }

    public String getDoctor_Degree() {
        return Doctor_Degree;
    }

    public void setDoctor_Degree(String doctor_Degree) {
        Doctor_Degree = doctor_Degree;
    }

    public Doctor(String doctor_ID, String doctor_UID, String doctor_Name, Integer doctor_Age, String doctor_Sex, String doctor_Office, String doctor_Mailbox, String doctor_Phone, String doctor_Degree) {
        Doctor_ID = doctor_ID;
        Doctor_UID = doctor_UID;
        Doctor_Name = doctor_Name;
        Doctor_Age = doctor_Age;
        Doctor_Sex = doctor_Sex;
        Doctor_Office = doctor_Office;
        Doctor_Mailbox = doctor_Mailbox;
        Doctor_Phone = doctor_Phone;
        Doctor_Degree = doctor_Degree;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Doctor_ID='" + Doctor_ID + '\'' +
                ", Doctor_UID='" + Doctor_UID + '\'' +
                ", Doctor_Name='" + Doctor_Name + '\'' +
                ", Doctor_Age=" + Doctor_Age +
                ", Doctor_Sex='" + Doctor_Sex + '\'' +
                ", Doctor_Office='" + Doctor_Office + '\'' +
                ", Doctor_Mailbox='" + Doctor_Mailbox + '\'' +
                ", Doctor_Phone='" + Doctor_Phone + '\'' +
                ", Doctor_Degree='" + Doctor_Degree + '\'' +
                '}';
    }
}