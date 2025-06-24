package com.example.javasinhvien.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.repository.TaiKhoanRepository;

@RestController
@RequestMapping("/api/taikhoan")
@CrossOrigin(origins = "*")
public class TaiKhoanController {

	@Autowired
	private TaiKhoanRepository taiKhoanRepository;

	@GetMapping
	public List<TaiKhoan> getAllTaiKhoan() {
		return taiKhoanRepository.findAll();
	}

	@PostMapping
	public TaiKhoan createTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
		return taiKhoanRepository.save(taiKhoan);
	}

	@PutMapping("/{username}")
	public TaiKhoan updateTaiKhoan(@PathVariable String username, @RequestBody TaiKhoan taiKhoan) {
		Optional<TaiKhoan> optional = taiKhoanRepository.findById(username);
		if (optional.isPresent()) {
			TaiKhoan tk = optional.get();
			tk.setPassword(taiKhoan.getPassword());
			tk.setRole(taiKhoan.getRole());
			tk.setHoten(taiKhoan.getHoten());
			return taiKhoanRepository.save(tk);
		} else {
			return null;
		}
	}

	@DeleteMapping("/{username}")
	public void deleteTaiKhoan(@PathVariable String username) {
		taiKhoanRepository.deleteById(username);
	}
}
