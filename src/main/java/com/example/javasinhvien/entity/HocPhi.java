package com.example.javasinhvien.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(HocPhiId.class)
@Table(name = "hocphi")
public class HocPhi {
	@Id
	private String masv;

	@Id
	private String mahk;
	private BigDecimal tongtien;

	private String trangthai;

	public HocPhi(String masv, String mahk, BigDecimal tongtien, String trangthai) {
		super();
		this.masv = masv;
		this.mahk = mahk;
		this.tongtien = tongtien;
		this.trangthai = trangthai;
	}

	public HocPhi() {

	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getMahk() {
		return mahk;
	}

	public void setMahk(String mahk) {
		this.mahk = mahk;
	}

	public BigDecimal getTongtien() {
		return tongtien;
	}

	public void setTongtien(BigDecimal tongtien) {
		this.tongtien = tongtien;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

}
