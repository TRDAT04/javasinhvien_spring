package com.example.javasinhvien.service;

import java.util.Optional;

import com.example.javasinhvien.entity.TaiKhoan;

public interface TaiKhoanService {
	Optional<TaiKhoan> login(String username, String password);
}
