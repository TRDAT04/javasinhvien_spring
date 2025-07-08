package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.SinhVien;
import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.repository.SinhVienRepository;
import com.example.javasinhvien.repository.TaiKhoanRepository;
import com.example.javasinhvien.service.SinhVienService;

@Service
public class SinhVienServiceImpl implements SinhVienService {

	@Autowired
	private SinhVienRepository sinhVienRepository;
	@Autowired
	private TaiKhoanRepository taiKhoanRepository;

	@Override
	public List<SinhVien> getAllSinhVien() {
		return sinhVienRepository.findAll();
	}

	@Override
	public Optional<SinhVien> getSinhVienById(String masv) {
		return sinhVienRepository.findById(masv);
	}

	@Override
	public SinhVien saveSinhVien(SinhVien sinhVien) {
		if (sinhVienRepository.existsById(sinhVien.getMasv())) {
			throw new RuntimeException("Mã sinh viên đã tồn tại!");
		}
		SinhVien saved = sinhVienRepository.save(sinhVien);

		if (!taiKhoanRepository.existsById(saved.getMasv())) {
			TaiKhoan tk = new TaiKhoan();
			tk.setUsername(saved.getMasv());
			tk.setPassword(saved.getMasv());
			tk.setRole("sinhvien");
			tk.setHoten(saved.getHoten());
			taiKhoanRepository.save(tk);
		}

		return saved;
	}

	@Override
	public SinhVien updateSinhVien(String masv, SinhVien sinhVien) {
		Optional<SinhVien> optionalSinhVien = sinhVienRepository.findById(masv);
		if (optionalSinhVien.isPresent()) {
			SinhVien sv = optionalSinhVien.get();
			sv.setHoten(sinhVien.getHoten());
			sv.setNgaysinh(sinhVien.getNgaysinh());
			sv.setGioitinh(sinhVien.getGioitinh());
			sv.setEmail(sinhVien.getEmail());
			sv.setSdt(sinhVien.getSdt());
			sv.setMalop(sinhVien.getMalop());
			return sinhVienRepository.save(sv);
		}
		return null;
	}

	@Override
	public void deleteSinhVien(String masv) {
		sinhVienRepository.deleteById(masv);
		taiKhoanRepository.deleteById(masv);
	}

	@Override
	public List<SinhVien> findByMasvAndTensv(String masv, String tensv) {
		return sinhVienRepository.findByMasvContainingAndHotenContaining(masv, tensv);
	}

	@Override
	public List<SinhVien> findByMaLop(String malop) {
		return sinhVienRepository.findByMalop(malop);
	}

}
