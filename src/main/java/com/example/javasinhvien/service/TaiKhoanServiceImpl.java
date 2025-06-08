package com.example.javasinhvien.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.repository.TaiKhoanRepository;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

	@Autowired
	private TaiKhoanRepository taiKhoanRepository;

	@Override
	public Optional<TaiKhoan> login(String username, String password) {
		return taiKhoanRepository.findByUsernameAndPassword(username, password);
	}
}
