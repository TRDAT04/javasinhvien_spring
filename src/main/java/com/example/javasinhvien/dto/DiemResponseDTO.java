package com.example.javasinhvien.dto;

public class DiemResponseDTO {
	private String masv;
	private String hoten;
	private String tenmon;
	private Double diem;

	public DiemResponseDTO() {

	}

	public DiemResponseDTO(String masv, String hoten, String tenmon, Double diem) {
		this.masv = masv;
		this.hoten = hoten;
		this.tenmon = tenmon;
		this.diem = diem;
	}

	// Getters & setters
	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}
}
