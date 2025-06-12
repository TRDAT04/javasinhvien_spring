package com.example.javasinhvien.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hocky")
public class HocKy {
	private String mahk;
	private String tenhk;

}
