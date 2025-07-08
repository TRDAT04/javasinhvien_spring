package com.example.javasinhvien.service.Impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;
import com.example.javasinhvien.entity.HocKy;
import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.repository.DangKyMonRepository;
import com.example.javasinhvien.repository.HocKyRepository;
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
	@Autowired
	private HocKyRepository hocKyRepo;

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

	public void delete(DangKyMonId id) {
		Optional<Mon> monOpt = monRepository.findById(id.getMamon());

		if (monOpt.isPresent()) {
			Mon mon = monOpt.get();
			HocKy hk = hocKyRepo.findById(mon.getMahk()).orElse(null);

			if (hk != null) {
				LocalDate now = LocalDate.now();
				LocalDate start = hk.getThoigianBatdau();
				long daysBetween = ChronoUnit.DAYS.between(start, now);

				if (daysBetween > 7) {
					throw new RuntimeException("Đã quá hạn 7 ngày kể từ khi học kỳ bắt đầu, không thể hủy đăng ký!");
				}
			}
		}

		repo.deleteById(id);
		hocPhiService.capNhatHocPhiSauDangKy(id.getMasv(), id.getMahk());
	}

	public List<Mon> getMonHocFullByMasvAndMahk(String masv, String mahk) {
		return monRepository.findMonByMasvAndMahk(masv, mahk);
	}
}