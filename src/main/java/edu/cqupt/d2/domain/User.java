package edu.cqupt.d2.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String  uid;
    private String  user_phone;
    private String  user_password;
    private String  user_doctor_no;
    private String  user_name;
    private String  user_third_num;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_doctor_no() {
        return user_doctor_no;
    }

    public void setUser_doctor_no(String user_doctor_no) {
        this.user_doctor_no = user_doctor_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_third_num() {
        return user_third_num;
    }

    public void setUser_third_num(String user_third_num) {
        this.user_third_num = user_third_num;
    }



    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String uid, String user_phone, String user_password, String user_doctor_no, String user_name, String user_third_num) {
        super();
        this.uid = uid;
        this.user_phone = user_phone;
        this.user_password = user_password;
        this.user_doctor_no = user_doctor_no;
        this.user_name = user_name;
        this.user_third_num = user_third_num;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_doctor_no='" + user_doctor_no + '\'' +
                ", user_patient_no='" + user_name + '\'' +
                ", user_third_num='" + user_third_num + '\'' +
                '}';
    }
}