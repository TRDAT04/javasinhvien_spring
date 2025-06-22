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
import com.example.javasinhvien.service.HocPhiService;

@Service
public class DangKyMonServiceImpl implements DangKyMonService {
	@Autowired
	private DangKyMonRepository repo;
	@Autowired
	private MonHocRepository monRepository;
	@Autowired
	private HocPhiService hocPhiService;

	@Override

	public List<DangKyMon> createMultiple(List<DangKyMon> ds) {
		List<DangKyMon> savedList = repo.saveAll(ds);

		if (!savedList.isEmpty()) {
			String masv = savedList.get(0).getMasv();
			String mahk = savedList.get(0).getMahk();
			hocPhiService.capNhatHocPhiSauDangKy(masv, mahk);
		}

		return savedList;
	}

	@Override
	public List<DangKyMon> getAll() {
		return repo.findAll();
	}

	@Override
	public void delete(DangKyMonId id) {
		repo.deleteById(id);
		hocPhiService.capNhatHocPhiSauDangKy(id.getMasv(), id.getMahk());
	}

	public List<Mon> getMonHocFullByMasvAndMahk(String masv, String mahk) {
		return monRepository.findMonByMasvAndMahk(masv, mahk);
	}
}