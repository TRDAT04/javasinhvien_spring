package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LNV
 */
public class DiemRequestDTO {

    private String masv;
    private String mamon;
    private int mahk;
    private Double diem;

    public DiemRequestDTO(String masv, String mamon, int mahk, Double diem) {
        this.masv = masv;
        this.mamon = mamon;
        this.mahk = mahk;
        this.diem = diem;
    }

    public DiemRequestDTO() {
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public void setMahk(int mahk) {
        this.mahk = mahk;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public String getMamon() {
        return mamon;
    }

    public int getMahk() {
        return mahk;
    }

    public Double getDiem() {
        return diem;
    }

}
