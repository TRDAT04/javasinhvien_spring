package com.example.javasinhvien.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class DangKyMonId implements Serializable {

	private String masv;
	private String mamon;
	private String mahk;

	public DangKyMonId() {
	}

	public DangKyMonId(String masv, String mamon, String mahk) {
		this.masv = masv;
		this.mamon = mamon;
		this.mahk = mahk;
	}

	// Getters and Setters
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof DangKyMonId))
			return false;
		DangKyMonId that = (DangKyMonId) o;
		return Objects.equals(masv, that.masv) && Objects.equals(mamon, that.mamon) && Objects.equals(mahk, that.mahk);
	}

	@Override
	public int hashCode() {
		return Objects.hash(masv, mamon, mahk);
	}
}
