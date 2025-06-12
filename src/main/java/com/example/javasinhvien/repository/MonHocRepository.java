package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.Mon;

public interface MonHocRepository extends JpaRepository<Mon, String> {
	List<Mon> findByMamonContainingAndTenmonContaining(String mamon, String tenmon);
}
