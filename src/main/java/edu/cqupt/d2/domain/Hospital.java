package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Hospital implements Serializable {
    private String  Hospital_ID;
    private String  Hospital_Name;
    private String  Hospital_Phone;
    private String  Hospital_Degree;

    public String getHospital_ID() {
        return Hospital_ID;
    }

    public void setHospital_ID(String hospital_ID) {
        Hospital_ID = hospital_ID;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        Hospital_Name = hospital_Name;
    }

    public String getHospital_Phone() {
        return Hospital_Phone;
    }

    public void setHospital_Phone(String hospital_Phone) {
        Hospital_Phone = hospital_Phone;
    }

    public String getHospital_Degree() {
        return Hospital_Degree;
    }

    public void setHospital_Degree(String hospital_Degree) {
        Hospital_Degree = hospital_Degree;
    }

    public Hospital(String hospital_ID, String hospital_Name, String hospital_Phone, String hospital_Degree) {
        Hospital_ID = hospital_ID;
        Hospital_Name = hospital_Name;
        Hospital_Phone = hospital_Phone;
        Hospital_Degree = hospital_Degree;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "Hospital_ID='" + Hospital_ID + '\'' +
                ", Hospital_Name='" + Hospital_Name + '\'' +
                ", Hospital_Phone='" + Hospital_Phone + '\'' +
                ", Hospital_Degree='" + Hospital_Degree + '\'' +
                '}';
    }
}