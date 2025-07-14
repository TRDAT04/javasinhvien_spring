/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.math.BigDecimal;

/**
 *
 * @author LNV
 */
public class HocPhi {

    private String masv;
    private String mahk;
    private BigDecimal tongtien;
    private String trangthai;

    public HocPhi() {
    }

    public HocPhi(String masv, String mahk, BigDecimal tongtien, String trangthai) {
        this.masv = masv;
        this.mahk = mahk;
        this.tongtien = tongtien;
        this.trangthai = trangthai;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    public void setTongtien(BigDecimal tongtien) {
        this.tongtien = tongtien;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getMasv() {
        return masv;
    }

    public String getMahk() {
        return mahk;
    }

    public BigDecimal getTongtien() {
        return tongtien;
    }

    public String getTrangthai() {
        return trangthai;
    }

}
