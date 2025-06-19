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

import com.example.javasinhvien.entity.HocKy;
import com.example.javasinhvien.service.HocKyService;

@RestController
@RequestMapping("/api/hocky")
public class HocKyController {

	@Autowired
	private HocKyService hocKyService;

	@GetMapping
	public List<HocKy> getAll() {
		return hocKyService.getAll();
	}

	@PostMapping
	public HocKy create(@RequestBody HocKy hk) {
		return hocKyService.create(hk);
	}

	@PutMapping("/{mahk}")
	public HocKy update(@PathVariable String mahk, @RequestBody HocKy hk) {
		return hocKyService.update(mahk, hk);
	}

	@DeleteMapping("/{mahk}")
	public void delete(@PathVariable String mahk) {
		hocKyService.delete(mahk);
	}

	@GetMapping("/{mahk}")
	public ResponseEntity<HocKy> getById(@PathVariable String mahk) {
		return hocKyService.getById(mahk).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/search")
	public List<HocKy> searchByMahkAndTenhk(@RequestParam(defaultValue = "") String mahk,
			@RequestParam(defaultValue = "") String tenhk) {

		return hocKyService.searchByMahkAndTenhk(mahk, tenhk);
	}
}
