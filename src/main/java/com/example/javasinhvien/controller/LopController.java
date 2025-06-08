package com.example.javasinhvien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.entity.Lop;
import com.example.javasinhvien.service.LopService;

@RestController
@RequestMapping("/api/lop")

public class LopController {

	@Autowired
	private LopService lopService;

	@GetMapping
	public List<Lop> getAllLop() {
		return lopService.getAll();
	}

	@GetMapping("/{malop}")
	public Lop getById(@PathVariable String malop) {
		return lopService.getById(malop);
	}

	@PostMapping
	public Lop create(@RequestBody Lop lop) {
		return lopService.create(lop);
	}

	@PutMapping("/{malop}")
	public Lop update(@PathVariable String malop, @RequestBody Lop lop) {
		return lopService.update(malop, lop);
	}

	@DeleteMapping("/{malop}")
	public void delete(@PathVariable String malop) {
		lopService.delete(malop);
	}

	@GetMapping("/search-by-tenlop")
	public List<Lop> searchByTenlop(@RequestParam String tenlop) {
		return lopService.searchByTenlop(tenlop);
	}

	@GetMapping("/search-by-khoa")
	public List<Lop> searchByKhoa(@RequestParam String khoa) {
		return lopService.searchByKhoa(khoa);
	}
}
