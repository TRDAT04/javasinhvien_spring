package com.example.javasinhvien.dto;

public class DiemRequestDTO {
	private String masv;
	private String mamon;
	private String mahk;
	private Double diem;

	public DiemRequestDTO() {
	}

	public DiemRequestDTO(String masv, String mamon, String mahk, Double diem) {
		this.masv = masv;
		this.mamon = mamon;
		this.mahk = mahk;
		this.diem = diem;
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

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}
}