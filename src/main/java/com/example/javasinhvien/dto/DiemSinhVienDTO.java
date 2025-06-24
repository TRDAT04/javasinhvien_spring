package com.example.javasinhvien.dto;

public class DiemSinhVienDTO {
	private String mamon;
	private String tenmon;
	private Double diem;

	public DiemSinhVienDTO(String mamon, String tenmon, Double diem) {
		super();
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.diem = diem;
	}

	public DiemSinhVienDTO() {
		super();
	}

	public String getMamon() {
		return mamon;
	}

	public void setMamon(String mamon) {
		this.mamon = mamon;
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
