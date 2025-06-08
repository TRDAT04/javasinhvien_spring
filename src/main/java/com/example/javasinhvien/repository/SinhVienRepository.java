package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.SinhVien;

public interface SinhVienRepository extends JpaRepository<SinhVien, String> {

	List<SinhVien> findByMasvContainingAndHotenContaining(String masv, String hoten);
}
