package com.example.javasinhvien.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hocky")
public class HocKy {
	@Id
	private String mahk;
	private String tenhk;

	public HocKy() {
	}

	public HocKy(String mahk, String tenhk) {
		super();
		this.mahk = mahk;
		this.tenhk = tenhk;
	}

	public String getMahk() {
		return mahk;
	}

	public void setMahk(String mahk) {
		this.mahk = mahk;
	}

	public String getTenhk() {
		return tenhk;
	}

	public void setTenhk(String tenhk) {
		this.tenhk = tenhk;
	}

}
