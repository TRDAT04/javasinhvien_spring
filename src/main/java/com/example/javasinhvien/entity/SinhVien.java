package com.example.javasinhvien.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @Column(length = 10)
    private String masv;

    @Column(nullable = false, length = 100)
    private String hoten;

    private java.sql.Date ngaysinh;

    @Column(length = 10)
    private String gioitinh;

    @Column(length = 100, unique = true)
    private String email;

    @Column(length = 15)
    private String sdt;

    @Column(length = 10)
    private String malop;

    // getters và setters
    public String getMasv() { return masv; }
    public void setMasv(String masv) { this.masv = masv; }

    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }

    public java.sql.Date getNgaysinh() { return ngaysinh; }
    public void setNgaysinh(java.sql.Date ngaysinh) { this.ngaysinh = ngaysinh; }

    public String getGioitinh() { return gioitinh; }
    public void setGioitinh(String gioitinh) { this.gioitinh = gioitinh; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSdt() { return sdt; }
    public void setSdt(String sdt) { this.sdt = sdt; }

    public String getMalop() { return malop; }
    public void setMalop(String malop) { this.malop = malop; }
}
