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

import com.example.javasinhvien.entity.Mon;
import com.example.javasinhvien.service.MonHocService;

@RestController
@RequestMapping("/api/mon")

public class MonController {

	@Autowired
	private MonHocService monService;

	@GetMapping
	public List<Mon> getAllmon() {
		return monService.getAll();
	}

	@GetMapping("/{mamon}")
	public ResponseEntity<Mon> getById(@PathVariable String mamon) {
		return monService.getById(mamon).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public Mon create(@RequestBody Mon mon) {
		return monService.create(mon);
	}

	@PutMapping("/{mamon}")
	public Mon update(@PathVariable String mamon, @RequestBody Mon mon) {
		return monService.update(mamon, mon);
	}

	@DeleteMapping("/{mamon}")
	public void delete(@PathVariable String mamon) {
		monService.delete(mamon);
	}

	@GetMapping("/search")
	public List<Mon> searchByMamonAndTenmon(@RequestParam(defaultValue = "") String mamon,
			@RequestParam(defaultValue = "") String tenmon) {

		return monService.searchByMamonAndTenmon(mamon, tenmon);
	}

	@GetMapping("/chuadangky")
	public List<Mon> getMonChuaDangKy(@RequestParam String masv, @RequestParam String mahk) {
		return monService.getMonChuaDangKyTheoHocKy(masv, mahk);
	}

	@GetMapping("/dadangky")
	public ResponseEntity<List<Mon>> getMonHocDaDangKy(@RequestParam String masv, @RequestParam String mahk) {
		List<Mon> dsMon = monService.getMonHocDaDangKy(masv, mahk);
		return ResponseEntity.ok(dsMon);
	}

	@GetMapping("/theohocky/{mahk}")
	public List<Mon> getMonTheoHocKy(@PathVariable String mahk) {
		return monService.getMonTheoHocKy(mahk);
	}

}
