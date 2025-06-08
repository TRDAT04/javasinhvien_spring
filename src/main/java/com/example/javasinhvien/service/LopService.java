package com.example.javasinhvien.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Lop;

@Service
public interface LopService {

	List<Lop> getAll();

	Lop getById(String malop);

	Lop create(Lop lop);

	Lop update(String malop, Lop lop);

	void delete(String malop);

	List<Lop> searchByTenlop(String tenlop);

	List<Lop> searchByKhoa(String khoa);

}
