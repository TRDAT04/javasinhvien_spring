/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNV
 */
public class ThongKeMonHocDTO {

    private String maMon;
    private String tenMon;
    private int soSinhVien;
    private int soDat;
    private int soRot;
    private double tyLeDat;
    private double tyLeRot;

    public ThongKeMonHocDTO(String maMon, String tenMon, int soSinhVien, int soDat, int soRot, double tyLeDat, double tyLeRot) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soSinhVien = soSinhVien;
        this.soDat = soDat;
        this.soRot = soRot;
        this.tyLeDat = tyLeDat;
        this.tyLeRot = tyLeRot;
    }

    public ThongKeMonHocDTO() {
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public void setSoDat(int soDat) {
        this.soDat = soDat;
    }

    public void setSoRot(int soRot) {
        this.soRot = soRot;
    }

    public void setTyLeDat(double tyLeDat) {
        this.tyLeDat = tyLeDat;
    }

    public void setTyLeRot(double tyLeRot) {
        this.tyLeRot = tyLeRot;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public int getSoDat() {
        return soDat;
    }

    public int getSoRot() {
        return soRot;
    }

    public double getTyLeDat() {
        return tyLeDat;
    }

    public double getTyLeRot() {
        return tyLeRot;
    }

}
