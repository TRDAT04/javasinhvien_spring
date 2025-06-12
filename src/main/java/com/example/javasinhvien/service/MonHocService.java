package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import com.example.javasinhvien.entity.Mon;

public interface MonHocService {
	List<Mon> getAll();

	Optional<Mon> getById(String malop);

	Mon create(Mon mon);

	Mon update(String mamon, Mon mon);

	void delete(String mamon);

	List<Mon> searchByMamonAndTenmon(String mamon, String tenmon);
}
