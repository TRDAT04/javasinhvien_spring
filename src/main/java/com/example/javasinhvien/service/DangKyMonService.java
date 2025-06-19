package com.example.javasinhvien.service;

import java.util.List;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;
import com.example.javasinhvien.entity.Mon;

public interface DangKyMonService {
	List<DangKyMon> createMultiple(List<DangKyMon> ds);

	void delete(DangKyMonId id);

	List<DangKyMon> getAll();

	List<Mon> getMonHocFullByMasvAndMahk(String masv, String mahk);

}
