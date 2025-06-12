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
	public ResponseEntity<Lop> getById(@PathVariable String malop) {
		return lopService.getById(malop).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public Lop create(@RequestBody Lop lop) {
		return lopService.create(lop);
	}

	@PutMapping("/{malop}")
	public Lop update(@PathVariable String malop, @RequestBody Lop lop) {
		return lopService.update(malop, lop);
	}

	@GetMapping("/check-exists/{malop}")
	public ResponseEntity<Boolean> checkExists(@PathVariable String malop) {
		boolean exists = lopService.getById(malop).isPresent();
		return ResponseEntity.ok(exists);
	}

	@DeleteMapping("/{malop}")
	public void delete(@PathVariable String malop) {
		lopService.delete(malop);
	}

	@GetMapping("/search")
	public List<Lop> searchByMalopAndTenlop(@RequestParam(defaultValue = "") String malop,
			@RequestParam(defaultValue = "") String tenlop) {

		return lopService.searchByMalopAndTenlop(malop, tenlop);
	}

}
