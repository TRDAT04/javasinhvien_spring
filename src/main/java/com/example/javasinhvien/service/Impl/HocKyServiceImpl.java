package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.HocKy;
import com.example.javasinhvien.repository.HocKyRepository;
import com.example.javasinhvien.service.HocKyService;

@Service
public class HocKyServiceImpl implements HocKyService {

	@Autowired
	private HocKyRepository hocKyRepository;

	@Override
	public List<HocKy> getAll() {
		return hocKyRepository.findAll();
	}

	@Override
	public Optional<HocKy> getById(String mahk) {
		return hocKyRepository.findById(mahk);
	}

	@Override
	public HocKy create(HocKy hk) {
		return hocKyRepository.save(hk);
	}

	@Override
	public HocKy update(String mahk, HocKy hk) {
		if (hocKyRepository.existsById(mahk)) {
			return hocKyRepository.save(hk);
		}
		return null;
	}

	@Override
	public void delete(String mahk) {
		hocKyRepository.deleteById(mahk);
	}

	@Override
	public List<HocKy> searchByMahkAndTenhk(String mahk, String tenhk) {
		return hocKyRepository.findByMahkContainingAndTenhkContaining(mahk, tenhk);
	}
}
