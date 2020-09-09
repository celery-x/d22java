package edu.cqupt.d2.domain;

import java.io.Serializable;

public class Patient implements Serializable {
    private String  Patient_UID;
    private String  Patient_Name;
    private String  Patient_Sex;
    private Integer Patient_Age;
    private String  Patient_Profession;
    private String  Patient_Location;
    private String  Patient_Birth_date;
    private String  Patient_Nation;
    private String  Patient_Blood_type;
    private boolean Patient_Is_Married;
    private String  Allergic_History;
    private String  Allergic_Medicine;

    public Patient(){};

    public Patient(String patient_UID, String patient_Name, String patient_Sex, Integer patient_Age, String patient_Profession, String patient_Location, String patient_Birth_date, String patient_Nation, String patient_Blood_type, boolean patient_Is_Married, String allergic_History, String allergic_Medicine) {
        Patient_UID = patient_UID;
        Patient_Name = patient_Name;
        Patient_Sex = patient_Sex;
        Patient_Age = patient_Age;
        Patient_Profession = patient_Profession;
        Patient_Location = patient_Location;
        Patient_Birth_date = patient_Birth_date;
        Patient_Nation = patient_Nation;
        Patient_Blood_type = patient_Blood_type;
        Patient_Is_Married = patient_Is_Married;
        Allergic_History = allergic_History;
        Allergic_Medicine = allergic_Medicine;
    }

    public String getPatient_UID() {
        return Patient_UID;
    }

    public void setPatient_UID(String patient_UID) {
        Patient_UID = patient_UID;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        Patient_Name = patient_Name;
    }

    public String getPatient_Sex() {
        return Patient_Sex;
    }

    public void setPatient_Sex(String patient_Sex) {
        Patient_Sex = patient_Sex;
    }

    public Integer getPatient_Age() {
        return Patient_Age;
    }

    public void setPatient_Age(Integer patient_Age) {
        Patient_Age = patient_Age;
    }

    public String getPatient_Profession() {
        return Patient_Profession;
    }

    public void setPatient_Profession(String patient_Profession) {
        Patient_Profession = patient_Profession;
    }

    public String getPatient_Location() {
        return Patient_Location;
    }

    public void setPatient_Location(String patient_Location) {
        Patient_Location = patient_Location;
    }

    public String getPatient_Birth_date() {
        return Patient_Birth_date;
    }

    public void setPatient_Birth_date(String patient_Birth_date) {
        Patient_Birth_date = patient_Birth_date;
    }

    public String getPatient_Nation() {
        return Patient_Nation;
    }

    public void setPatient_Nation(String patient_Nation) {
        Patient_Nation = patient_Nation;
    }

    public String getPatient_Blood_type() {
        return Patient_Blood_type;
    }

    public void setPatient_Blood_type(String patient_Blood_type) {
        Patient_Blood_type = patient_Blood_type;
    }

    public boolean isPatient_Is_Married() {
        return Patient_Is_Married;
    }

    public void setPatient_Is_Married(boolean patient_Is_Married) {
        Patient_Is_Married = patient_Is_Married;
    }

    public String getAllergic_History() {
        return Allergic_History;
    }

    public void setAllergic_History(String allergic_History) {
        Allergic_History = allergic_History;
    }

    public String getAllergic_Medicine() {
        return Allergic_Medicine;
    }

    public void setAllergic_Medicine(String allergic_Medicine) {
        Allergic_Medicine = allergic_Medicine;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Patient_UID='" + Patient_UID + '\'' +
                ", Patient_Name='" + Patient_Name + '\'' +
                ", Patient_Sex='" + Patient_Sex + '\'' +
                ", Patient_Age=" + Patient_Age +
                ", Patient_Profession='" + Patient_Profession + '\'' +
                ", Patient_Location='" + Patient_Location + '\'' +
                ", Patient_Birth_date='" + Patient_Birth_date + '\'' +
                ", Patient_Nation='" + Patient_Nation + '\'' +
                ", Patient_Blood_type='" + Patient_Blood_type + '\'' +
                ", Patient_Is_Married=" + Patient_Is_Married +
                ", Allergic_History='" + Allergic_History + '\'' +
                ", Allergic_Medicine='" + Allergic_Medicine + '\'' +
                '}';
    }
}