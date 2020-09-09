package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Admin implements Serializable {
    private String Admin_UID;
    private String Admin_PWD;
    private String Admin_Question_Verify;
    private String Admin_Answer_Verify;

    public String getAdmin_UID() {
        return Admin_UID;
    }

    public void setAdmin_UID(String admin_UID) {
        Admin_UID = admin_UID;
    }

    public String getAdmin_PWD() {
        return Admin_PWD;
    }

    public void setAdmin_PWD(String admin_PWD) {
        Admin_PWD = admin_PWD;
    }

    public String getAdmin_Question_Verify() {
        return Admin_Question_Verify;
    }

    public void setAdmin_Question_Verify(String admin_Question_Verify) {
        Admin_Question_Verify = admin_Question_Verify;
    }

    public String getAdmin_Answer_Verify() {
        return Admin_Answer_Verify;
    }

    public void setAdmin_Answer_Verify(String admin_Answer_Verify) {
        Admin_Answer_Verify = admin_Answer_Verify;
    }

    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Admin(String Admin_UID, String Admin_PWD, String Admin_Question_Verify, String Admin_Answer_Verify) {
        super();
        this.Admin_UID = Admin_UID;
        this.Admin_PWD = Admin_PWD;
        this.Admin_Question_Verify = Admin_Question_Verify;
        this.Admin_Answer_Verify = Admin_Answer_Verify;

    }

    @Override
    public String toString() {
        return "Admin{" +
                "Admin_UID='" + Admin_UID + '\'' +
                ", Admin_PWD='" + Admin_PWD + '\'' +
                ", Admin_Question_Verify='" + Admin_Question_Verify + '\'' +
                ", Admin_Answer_Verify='" + Admin_Answer_Verify + '\'' +
                '}';
    }
}