package com.example.javasinhvien.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.TaiKhoan;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
	Optional<TaiKhoan> findByUsernameAndPassword(String username, String password);
}
