package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javasinhvien.entity.Lop;

@Repository
public interface LopRepository extends JpaRepository<Lop, String> {
	List<Lop> findByTenlopContainingIgnoreCase(String tenlop);

	List<Lop> findByKhoaContainingIgnoreCase(String khoa);
}