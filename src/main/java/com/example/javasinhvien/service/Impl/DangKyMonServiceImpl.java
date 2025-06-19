package com.example.javasinhvien.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;
import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.repository.DangKyMonRepository;
import com.example.javasinhvien.repository.MonHocRepository;
import com.example.javasinhvien.service.DangKyMonService;

@Service
public class DangKyMonServiceImpl implements DangKyMonService {
	@Autowired
	private DangKyMonRepository repo;
	@Autowired
	private MonHocRepository monRepository;

	@Override

	public List<DangKyMon> createMultiple(List<DangKyMon> ds) {
		return repo.saveAll(ds);
	}

	@Override
	public List<DangKyMon> getAll() {
		return repo.findAll();
	}

	@Override
	public void delete(DangKyMonId id) {
		repo.deleteById(id);
	}

	public List<Mon> getMonHocFullByMasvAndMahk(String masv, String mahk) {
		return monRepository.findMonByMasvAndMahk(masv, mahk);
	}
}