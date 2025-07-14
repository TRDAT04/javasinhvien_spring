/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNV
 */
public class DiemResponseDTO {

    private String masv;
    private String hoten;
    private String tenmon;
    private double diem;

    public DiemResponseDTO() {
    }

    public DiemResponseDTO(String masv, String hoten, String tenmon, double diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.tenmon = tenmon;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getTenmon() {
        return tenmon;
    }

    public double getDiem() {
        return diem;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
