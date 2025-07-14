/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNV
 */
public class DiemSinhVienDTO {

    private String mamon;
    private String tenmon;
    private Double diem;
    private int sotinchi;

    public DiemSinhVienDTO() {
    }

    public DiemSinhVienDTO(String mamon, String tenmon, Double diem) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.diem = diem;
    }

    public String getMamon() {
        return mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public Double getDiem() {
        return diem;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }
}
