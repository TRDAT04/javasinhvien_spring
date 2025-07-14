/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNV
 */
public class SinhVienDTO {

    private String masv;
    private String hoten;

    public SinhVienDTO(String masv, String hoten) {
        this.masv = masv;
        this.hoten = hoten;
    }

    public SinhVienDTO() {
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

}
