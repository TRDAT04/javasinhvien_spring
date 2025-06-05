package com.example.javasinhvien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.SinhVien;

public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
	// Spring Data JPA tự implement các method CRUD
}
