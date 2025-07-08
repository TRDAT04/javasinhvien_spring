package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.repository.MonHocRepository;
import com.example.javasinhvien.service.MonHocService;

@Service
public class MonHocServiceImpl implements MonHocService {

	@Autowired
	private MonHocRepository MonhocRepository;

	@Override
	public List<Mon> getAll() {
		return MonhocRepository.findAll();
	}

	@Override
	public Optional<Mon> getById(String maMonhoc) {
		return MonhocRepository.findById(maMonhoc);
	}

	@Override
	public Mon create(Mon Monhoc) {
		if (MonhocRepository.existsById(Monhoc.getMamon())) {
			throw new RuntimeException("Mã môn học đã tồn tại!");
		}
		return MonhocRepository.save(Monhoc);
	}

	@Override
	public Mon update(String maMonhoc, Mon Monhoc) {
		if (!MonhocRepository.existsById(maMonhoc))
			return null;
		Monhoc.setMamon(maMonhoc);
		return MonhocRepository.save(Monhoc);
	}

	@Override
	public void delete(String maMonhoc) {
		MonhocRepository.deleteById(maMonhoc);
	}

	@Override
	public List<Mon> searchByMamonAndTenmon(String mamon, String tenmon) {
		return MonhocRepository.findByMamonContainingAndTenmonContaining(mamon, tenmon);
	}

	@Override
	public List<Mon> getMonChuaDangKyTheoHocKy(String masv, String mahk) {
		return MonhocRepository.findMonChuaDangKyTheoHocKy(masv, mahk);
	}

	@Override
	public List<Mon> getMonHocDaDangKy(String masv, String mahk) {
		return MonhocRepository.findMonHocDaDangKy(masv, mahk);
	}

	@Override
	public List<Mon> getMonTheoHocKy(String mahk) {
		return MonhocRepository.findByMahk(mahk);
	}

}
