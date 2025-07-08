package com.example.javasinhvien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.SinhVien;
import com.example.javasinhvien.service.SinhVienService;

@RestController
@RequestMapping("/api/sinhvien")
public class SinhVienController {

	@Autowired
	private SinhVienService sinhVienService;

	@GetMapping
	public List<SinhVien> getAllSinhVien() {
		return sinhVienService.getAllSinhVien();
	}

	@GetMapping("/{masv}")
	public ResponseEntity<SinhVien> getSinhVienById(@PathVariable String masv) {
		return sinhVienService.getSinhVienById(masv).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/search")
	public List<SinhVien> searchSinhVien(@RequestParam(defaultValue = "") String masv,
			@RequestParam(defaultValue = "") String tensv) {

		return sinhVienService.findByMasvAndTensv(masv, tensv);
	}

	@PostMapping
	public SinhVien createSinhVien(@RequestBody SinhVien sinhVien) {
		return sinhVienService.saveSinhVien(sinhVien);
	}

	@PutMapping("/{masv}")
	public ResponseEntity<SinhVien> updateSinhVien(@PathVariable String masv, @RequestBody SinhVien sinhVien) {
		SinhVien updated = sinhVienService.updateSinhVien(masv, sinhVien);
		if (updated == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping("/{masv}")
	public ResponseEntity<Void> deleteSinhVien(@PathVariable String masv) {
		sinhVienService.deleteSinhVien(masv);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/lop/{malop}")
	public List<SinhVien> getSinhVienByLop(@PathVariable String malop) {
		return sinhVienService.findByMaLop(malop);
	}
}
