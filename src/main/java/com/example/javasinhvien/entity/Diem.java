package com.example.javasinhvien.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "diem")
public class Diem {

	@EmbeddedId
	private DiemId id;

	private Double diem;

	public Diem() {
	}

	public Diem(DiemId id, Double diem) {
		this.id = id;
		this.diem = diem;
	}

	public DiemId getId() {
		return id;
	}

	public void setId(DiemId id) {
		this.id = id;
	}

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}

}
