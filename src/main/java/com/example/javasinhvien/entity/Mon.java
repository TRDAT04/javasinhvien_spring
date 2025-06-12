package com.example.javasinhvien.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monhoc")
public class Mon {

	@Id
	private String mamon;

	private String tenmon;

	private Integer sotinchi;

	@Column(name = "gia_tinchi")
	private Double giaTinchi;

	public Mon() {
	}

	public Mon(String mamon, String tenmon, Integer sotinchi, Double gia_tinchi) {
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.sotinchi = sotinchi;
		this.giaTinchi = gia_tinchi;
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

	public Integer getSotinchi() {
		return sotinchi;
	}

	public void setSotinchi(Integer sotinchi) {
		this.sotinchi = sotinchi;
	}

	public Double getGiaTinchi() {
		return giaTinchi;
	}

	public void setGiaTinchi(Double giaTinchi) {
		this.giaTinchi = giaTinchi;
	}
}
