/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class DiemId {

    private String masv;
    private String mamon;
    private String mahk;

    public DiemId() {
    }

    public DiemId(String masv, String mamon, String mahk) {
        this.masv = masv;
        this.mamon = mamon;
        this.mahk = mahk;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }
}
