package com.example.javasinhvien.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hocky")
public class HocKy {
	@Id
	private String mahk;
	private String tenhk;
	@Column(name = "thoigian_batdau")
	private LocalDate thoigianBatdau;

	@Column(name = "thoigian_ketthuc")
	private LocalDate thoigianKetthuc;

	public HocKy() {
	}

	public HocKy(String mahk, String tenhk, LocalDate thoigianBatdau, LocalDate thoigianKetthuc) {
		this.mahk = mahk;
		this.tenhk = tenhk;
		this.thoigianBatdau = thoigianBatdau;
		this.thoigianKetthuc = thoigianKetthuc;
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

	public LocalDate getThoigianBatdau() {
		return thoigianBatdau;
	}

	public void setThoigianBatdau(LocalDate thoigianBatdau) {
		this.thoigianBatdau = thoigianBatdau;
	}

	public LocalDate getThoigianKetthuc() {
		return thoigianKetthuc;
	}

	public void setThoigianKetthuc(LocalDate thoigianKetthuc) {
		this.thoigianKetthuc = thoigianKetthuc;
	}
}
