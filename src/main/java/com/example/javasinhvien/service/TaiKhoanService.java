package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import com.example.javasinhvien.dto.DoiMatKhauRequestDTO;
import com.example.javasinhvien.entity.TaiKhoan;

public interface TaiKhoanService {
	Optional<TaiKhoan> login(String username, String password);

	List<TaiKhoan> getAll();

	TaiKhoan save(TaiKhoan taiKhoan);

	List<TaiKhoan> findByUsernameAndHoten(String username, String hoten);

	TaiKhoan update(String username, TaiKhoan taiKhoan);

	void delete(String username);

	String doiMatKhau(DoiMatKhauRequestDTO request);

	List<TaiKhoan> searchTaiKhoan(String username, String tensv);

}
