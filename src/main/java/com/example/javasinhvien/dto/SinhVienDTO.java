package com.example.javasinhvien.dto;

public class SinhVienDTO {
	private String masv;
	private String hoten;

	public SinhVienDTO(String masv, String hoten) {
		this.masv = masv;
		this.hoten = hoten;
	}

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

}
