/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class DangKy {

    private String masv;
    private String mahk;
    private String mamon;

    public DangKy(String masv, String mahk, String mamon) {
        this.masv = masv;
        this.mahk = mahk;
        this.mamon = mamon;
    }

    public DangKy() {
    }

    public String getMasv() {
        return masv;
    }

    public String getMahk() {
        return mahk;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

}
