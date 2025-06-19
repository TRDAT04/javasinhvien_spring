package com.example.javasinhvien.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "dangky")
@IdClass(DangKyMonId.class)
public class DangKyMon {
	@Id
	private String masv;
	@Id
	private String mamon;
	@Id
	private String mahk;

	public DangKyMon(String masv, String mamon, String mahk) {
		super();
		this.masv = masv;
		this.mamon = mamon;
		this.mahk = mahk;
	}

	public DangKyMon() {

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
