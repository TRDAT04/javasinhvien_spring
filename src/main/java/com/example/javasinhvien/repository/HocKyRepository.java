package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.HocKy;

public interface HocKyRepository extends JpaRepository<HocKy, String> {
	List<HocKy> findByMahkContainingAndTenhkContaining(String mahk, String tenhk);
}
