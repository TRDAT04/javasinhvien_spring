package com.example.javasinhvien.dto;

public class DiemSinhVienDTO {
	private String mamon;
	private String tenmon;
	private Double diem;
	private int sotinchi;

	public DiemSinhVienDTO(String mamon, String tenmon, int sotinchi, Double diem) {
		super();
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.sotinchi = sotinchi;
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

	public int getSotinchi() {
		return sotinchi;
	}

	public void setSotinchi(int sotinchi) {
		this.sotinchi = sotinchi;
	}

}
