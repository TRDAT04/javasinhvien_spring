package com.example.javasinhvien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.dto.DoiMatKhauRequestDTO;
import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.service.TaiKhoanService;

@RestController
@RequestMapping("/api/taikhoan")
@CrossOrigin(origins = "*")
public class TaiKhoanController {

	@Autowired
	private TaiKhoanService taiKhoanService;

	@GetMapping
	public List<TaiKhoan> getAllTaiKhoan() {
		return taiKhoanService.getAll();
	}

	@PostMapping
	public ResponseEntity<?> createTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
		try {
			TaiKhoan created = taiKhoanService.save(taiKhoan);
			return ResponseEntity.ok(created);
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping("/{username}")
	public ResponseEntity<?> updateTaiKhoan(@PathVariable String username, @RequestBody TaiKhoan taiKhoan) {
		TaiKhoan updated = taiKhoanService.update(username, taiKhoan);
		if (updated == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping("/{username}")
	public ResponseEntity<?> deleteTaiKhoan(@PathVariable String username) {
		taiKhoanService.delete(username);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/doimatkhau")
	public ResponseEntity<String> doiMatKhau(@RequestBody DoiMatKhauRequestDTO request) {
		String result = taiKhoanService.doiMatKhau(request);
		if ("Đổi mật khẩu thành công!".equals(result)) {
			return ResponseEntity.ok(result);
		} else {
			return ResponseEntity.badRequest().body(result);
		}
	}

	@GetMapping("/search")
	public List<TaiKhoan> searchTaiKhoan(@RequestParam(required = false, defaultValue = "") String username,
			@RequestParam(required = false, defaultValue = "") String tensv) {
		return taiKhoanService.searchTaiKhoan(username, tensv);
	}

}
