/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class HocKy {

    private String mahk;
    private String tenhk;
    private String thoigianBatdau;
    private String thoigianKetthuc;

    public HocKy() {
    }

    public HocKy(String mahk, String tenhk, String thoigianBatdau, String thoigianKetthuc) {
        this.mahk = mahk;
        this.tenhk = tenhk;
        this.thoigianBatdau = thoigianBatdau;
        this.thoigianKetthuc = thoigianKetthuc;
    }

    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    public String getTenhk() {
        return tenhk;
    }

    public void setTenhk(String tenhk) {
        this.tenhk = tenhk;
    }

    public String getThoigianBatdau() {
        return thoigianBatdau;
    }

    public void setThoigianBatdau(String thoigianBatdau) {
        this.thoigianBatdau = thoigianBatdau;
    }

    public String getThoigianKetthuc() {
        return thoigianKetthuc;
    }

    public void setThoigianKetthuc(String thoigianKetthuc) {
        this.thoigianKetthuc = thoigianKetthuc;
    }
}
