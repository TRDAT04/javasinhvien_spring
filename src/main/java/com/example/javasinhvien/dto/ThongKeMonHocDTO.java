package com.example.javasinhvien.dto;

public class ThongKeMonHocDTO {
	private String maMon;
	private String tenMon;
	private int soSinhVien;
	private int soDat;
	private int soRot;
	private double tyLeDat;
	private double tyLeRot; // %

	public ThongKeMonHocDTO(String maMon, String tenMon, int soSinhVien, int soDat, int soRot) {
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.soSinhVien = soSinhVien;
		this.soDat = soDat;
		this.soRot = soRot;
		this.tyLeDat = soSinhVien == 0 ? 0.0 : ((double) soDat / soSinhVien) * 100;
		this.tyLeRot = soSinhVien == 0 ? 0.0 : ((double) soRot / soSinhVien) * 100;

	}

	public ThongKeMonHocDTO() {

	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public int getSoSinhVien() {
		return soSinhVien;
	}

	public void setSoSinhVien(int soSinhVien) {
		this.soSinhVien = soSinhVien;
	}

	public int getSoDat() {
		return soDat;
	}

	public void setSoDat(int soDat) {
		this.soDat = soDat;
	}

	public int getSoRot() {
		return soRot;
	}

	public void setSoRot(int soRot) {
		this.soRot = soRot;
	}

	public double getTyLeDat() {
		return tyLeDat;
	}

	public void setTyLeDat(double tyLeDat) {
		this.tyLeDat = tyLeDat;
	}

	public double getTyLeRot() {
		return tyLeRot;
	}

	public void setTyLeRot(double tyLeRot) {
		this.tyLeRot = tyLeRot;
	}

}
