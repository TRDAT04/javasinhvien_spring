package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import com.example.javasinhvien.entity.SinhVien;

public interface SinhVienService {
	List<SinhVien> getAllSinhVien();

	Optional<SinhVien> getSinhVienById(String masv);

	SinhVien saveSinhVien(SinhVien sinhVien);

	SinhVien updateSinhVien(String masv, SinhVien sinhVien);

	void deleteSinhVien(String masv);
}
