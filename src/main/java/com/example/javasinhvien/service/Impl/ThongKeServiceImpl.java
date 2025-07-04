package com.example.javasinhvien.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.dto.ThongKeMonHocDTO;
import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.repository.DiemRepository;
import com.example.javasinhvien.repository.MonHocRepository;
import com.example.javasinhvien.service.ThongKeService;

@Service
public class ThongKeServiceImpl implements ThongKeService {

	@Autowired
	private DiemRepository diemRepository;

	@Autowired
	private MonHocRepository monHocRepository;

	@Override
	public List<ThongKeMonHocDTO> thongKeTyLeDatMon() {
		List<ThongKeMonHocDTO> result = new ArrayList<>();

		List<Mon> dsMon = monHocRepository.findAll();
		for (Mon mon : dsMon) {
			List<Diem> diemList = diemRepository.findById_Mamon(mon.getMamon());

			int tong = diemList.size();
			int soDat = (int) diemList.stream().filter(d -> d.getDiem() != null && d.getDiem() >= 5.0).count();
			int soRot = tong - soDat;

			result.add(new ThongKeMonHocDTO(mon.getMamon(), mon.getTenmon(), tong, soDat, soRot));
		}

		return result;
	}
}
