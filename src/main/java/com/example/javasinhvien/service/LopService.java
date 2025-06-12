package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Lop;

@Service
public interface LopService {

	List<Lop> getAll();

	Optional<Lop> getById(String malop);

	Lop create(Lop lop);

	Lop update(String malop, Lop lop);

	void delete(String malop);

	List<Lop> searchByMalopAndTenlop(String malop, String tenlop);

}
