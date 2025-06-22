package com.example.javasinhvien.service.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.HocPhi;
import com.example.javasinhvien.entity.HocPhiId;
import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.repository.DangKyMonRepository;
import com.example.javasinhvien.repository.HocPhiRepository;
import com.example.javasinhvien.repository.MonHocRepository;
import com.example.javasinhvien.service.HocPhiService;

@Service
public class HocPhiServiceImpl implements HocPhiService {

	@Autowired
	private HocPhiRepository hocPhiRepository;
	@Autowired
	private DangKyMonRepository dangKyMonRepository;

	@Autowired
	private MonHocRepository monHocRepository;

	@Override
	public List<HocPhi> getAllHocPhi() {
		return hocPhiRepository.findAll();
	}

	@Override
	public HocPhi getHocPhiByMasvAndMahk(String masv, String mahk) {
		HocPhiId id = new HocPhiId(masv, mahk);
		return hocPhiRepository.findById(id).orElse(null);
	}

	@Override
	public HocPhi saveOrUpdate(HocPhi hocPhi) {
		return hocPhiRepository.save(hocPhi);
	}

	@Override
	public void capNhatHocPhiSauDangKy(String masv, String mahk) {
		List<DangKyMon> danhSach = dangKyMonRepository.findByMasvAndMahk(masv, mahk);
		BigDecimal tongTien = BigDecimal.ZERO;

		for (DangKyMon dk : danhSach) {
			Mon mon = monHocRepository.findById(dk.getMamon()).orElse(null);
			if (mon != null) {
				BigDecimal donGia = BigDecimal.valueOf(mon.getGiaTinchi());
				tongTien = tongTien.add(donGia.multiply(BigDecimal.valueOf(mon.getSotinchi())));
			}
		}

		HocPhiId id = new HocPhiId(masv, mahk);
		HocPhi hocPhi = hocPhiRepository.findById(id).orElse(new HocPhi());
		hocPhi.setMasv(masv);
		hocPhi.setMahk(mahk);
		hocPhi.setTongtien(tongTien);

		if (hocPhi.getTrangthai() == null) {
			hocPhi.setTrangthai("Chưa nộp");
		}

		hocPhiRepository.save(hocPhi);
	}

	@Override
	public HocPhi updateTrangThai(String masv, String mahk, String trangthai) {
		HocPhiId id = new HocPhiId();
		id.setMasv(masv);
		id.setMahk(mahk);
		HocPhi hocPhi = hocPhiRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy học phí"));

		hocPhi.setTrangthai(trangthai);
		return hocPhiRepository.save(hocPhi);
	}
}