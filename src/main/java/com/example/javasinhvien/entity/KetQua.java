package com.example.javasinhvien.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ketqua")
public class KetQua {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "masv")
	private SinhVien sinhVien;

	@ManyToOne
	@JoinColumn(name = "mamon")
	private Mon monHoc;

	@Column(name = "diem")
	private Double diem;

	// Constructors
	public KetQua() {
	}

	public KetQua(SinhVien sinhVien, Mon monHoc, Double diem) {
		this.sinhVien = sinhVien;
		this.monHoc = monHoc;
		this.diem = diem;
	}

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public Mon getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(Mon monHoc) {
		this.monHoc = monHoc;
	}

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}
}
