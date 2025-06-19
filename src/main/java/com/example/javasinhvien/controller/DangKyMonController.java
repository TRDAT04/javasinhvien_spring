package com.example.javasinhvien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;
import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.service.DangKyMonService;

@RestController
@RequestMapping("/api/dangky")
public class DangKyMonController {
	@Autowired
	private DangKyMonService service;

	@PostMapping
	public List<DangKyMon> createMultiple(@RequestBody List<DangKyMon> danhSachDangKy) {
		return service.createMultiple(danhSachDangKy);
	}

	@GetMapping
	public List<DangKyMon> getAll() {
		return service.getAll();
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@RequestParam String masv, @RequestParam String mamon, @RequestParam String mahk) {
		DangKyMonId id = new DangKyMonId(masv, mamon, mahk);
		service.delete(id);
		return ResponseEntity.ok("Xóa thành công");
	}

	@GetMapping("/monhoc")
	public ResponseEntity<List<Mon>> getMonHocFullByMasvAndMahk(@RequestParam String masv, @RequestParam String mahk) {
		List<Mon> dsMon = service.getMonHocFullByMasvAndMahk(masv, mahk);
		return ResponseEntity.ok(dsMon);
	}
}
