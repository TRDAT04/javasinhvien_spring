package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import com.example.javasinhvien.entity.HocKy;

public interface HocKyService {
	List<HocKy> getAll();

	Optional<HocKy> getById(String mahk);

	HocKy create(HocKy hk);

	HocKy update(String mahk, HocKy hk);

	void delete(String mahk);

	List<HocKy> searchByMahkAndTenhk(String mahk, String tenhk);
}
