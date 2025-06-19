package com.example.javasinhvien.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lop")
public class Lop {
	@Id
	@Column(length = 10)
	private String malop;
	private String tenlop;
	private String khoa;

	public Lop() {

	}

	public Lop(String malop, String tenlop, String khoa) {
		super();
		this.malop = malop;
		this.tenlop = tenlop;
		this.khoa = khoa;
	}

	// getters và setters
	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public String getTenlop() {
		return tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
}
