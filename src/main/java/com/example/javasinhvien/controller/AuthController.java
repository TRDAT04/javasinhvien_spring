package com.example.javasinhvien.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.service.TaiKhoanService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private TaiKhoanService taiKhoanService;

	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> credentials) {
		String username = credentials.get("username");
		String password = credentials.get("password");

		Optional<TaiKhoan> optionalTaiKhoan = taiKhoanService.login(username, password);
		if (optionalTaiKhoan.isPresent()) {
			TaiKhoan tk = optionalTaiKhoan.get();
			Map<String, String> response = new HashMap<>();
			response.put("username", tk.getUsername());
			response.put("role", tk.getRole());
			response.put("hoten", tk.getHoten());
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
}
