package edu.cqupt.d2.domain;

import java.io.Serializable;
import java.util.Arrays;

public class OCR_PIC implements Serializable {
    private double  Pic_ID;
    private byte[] Pic_Data;
    private String  Pic_Type;

    public OCR_PIC() {
    }

    public OCR_PIC(double pic_ID, byte[] pic_Data, String pic_Type) {
        Pic_ID = pic_ID;
        Pic_Data = pic_Data;
        Pic_Type = pic_Type;
    }

    public double getPic_ID() {
        return Pic_ID;
    }

    public void setPic_ID(double pic_ID) {
        Pic_ID = pic_ID;
    }

    public byte[] getPic_Data() {
        return Pic_Data;
    }

    public void setPic_Data(byte[] pic_Data) {
        Pic_Data = pic_Data;
    }

    public String getPic_Type() {
        return Pic_Type;
    }

    public void setPic_Type(String pic_Type) {
        Pic_Type = pic_Type;
    }

    @Override
    public String toString() {
        return "OCR_PIC{" +
                "Pic_ID=" + Pic_ID +
                ", Pic_Data=" + Arrays.toString(Pic_Data) +
                ", Pic_Type='" + Pic_Type + '\'' +
                '}';
    }
}