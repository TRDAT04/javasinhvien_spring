package com.example.javasinhvien.service;

import java.util.List;

import com.example.javasinhvien.entity.HocPhi;

public interface HocPhiService {

	HocPhi saveOrUpdate(HocPhi hocPhi);

	HocPhi updateTrangThai(String masv, String mahk, String trangthai);

	void capNhatHocPhiSauDangKy(String masv, String mahk);

	public HocPhi getHocPhiByMasvAndMahk(String masv, String mahk);

	public List<HocPhi> getAllHocPhi();

}
