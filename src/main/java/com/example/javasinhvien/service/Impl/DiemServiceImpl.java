package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.dto.DiemResponseDTO;
import com.example.javasinhvien.dto.DiemSinhVienDTO;
import com.example.javasinhvien.dto.SinhVienDTO;
import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;
import com.example.javasinhvien.repository.DangKyMonRepository;
import com.example.javasinhvien.repository.DiemRepository;
import com.example.javasinhvien.service.DiemService;

@Service
public class DiemServiceImpl implements DiemService {
	@Autowired
	private DiemRepository repository;
	@Autowired
	private DangKyMonRepository dangKiMonRepo;

	@Override
	public List<Diem> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Diem> getById(DiemId id) {
		return repository.findById(id);
	}

	@Override
	public Diem create(Diem diem) {
		if (repository.existsById(diem.getId())) {
			throw new RuntimeException("Điểm đã tồn tại.");
		}
		return repository.save(diem);
	}

	@Override
	public Diem update(Diem diem) {
		if (!repository.existsById(diem.getId())) {
			throw new RuntimeException("Không tìm thấy để cập nhật.");
		}
		return repository.save(diem);
	}

	@Override
	public void delete(DiemId id) {
		repository.deleteById(id);
	}

	public List<SinhVienDTO> getSinhVienChuaCoDiem(String mamon, String mahk) {
		return dangKiMonRepo.findSinhVienChuaCoDiem(mamon, mahk);
	}

	public List<DiemResponseDTO> getDanhSachDiem(String mamon, String mahk) {
		return repository.getDanhSachDiem(mamon, mahk);
	}

	@Override
	public List<DiemSinhVienDTO> getDiemSinhVien(String masv, String mahk) {
		return repository.getDiemSinhVienTheoHocKy(masv, mahk);
	}

}
