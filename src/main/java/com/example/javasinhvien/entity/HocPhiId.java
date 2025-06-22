package com.example.javasinhvien.entity;

public class HocPhiId {
	private String masv;
	private String mahk;

	public HocPhiId(String masv, String mahk) {
		super();
		this.masv = masv;
		this.mahk = mahk;
	}

	public HocPhiId() {

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

}
