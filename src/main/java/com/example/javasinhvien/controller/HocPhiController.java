package com.example.javasinhvien.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.HocPhi;
import com.example.javasinhvien.repository.SinhVienRepository;
import com.example.javasinhvien.service.HocPhiService;

@RestController
@RequestMapping("/api/hocphi")
public class HocPhiController {

	@Autowired
	private HocPhiService hocPhiService;
	@Autowired
	private SinhVienRepository sinhVienRepository;

	@GetMapping("/all")
	public List<HocPhi> getAllHocPhi() {
		return hocPhiService.getAllHocPhi();
	}

	@GetMapping("/{masv}/{mahk}")
	public ResponseEntity<?> getHocPhiByMasvAndMahk(@PathVariable String masv, @PathVariable String mahk) {

		if (!sinhVienRepository.existsById(masv)) {
			return ResponseEntity.badRequest().body("Mã sinh viên không tồn tại.");
		}

		HocPhi hocPhi = hocPhiService.getHocPhiByMasvAndMahk(masv, mahk);
		if (hocPhi == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không có học phí cho học kỳ này.");
		}

		return ResponseEntity.ok(hocPhi);
	}

	@PostMapping("/")
	public HocPhi saveHocPhi(@RequestBody HocPhi hocPhi) {
		return hocPhiService.saveOrUpdate(hocPhi);
	}

	@PutMapping("/{masv}/{mahk}/trangthai")
	public HocPhi updateTrangThai(@PathVariable String masv, @PathVariable String mahk,
			@RequestBody Map<String, String> body) {
		String trangthai = body.get("trangthai");
		return hocPhiService.updateTrangThai(masv, mahk, trangthai);
	}
}
