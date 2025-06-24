package com.example.javasinhvien.controller;

import java.util.List;

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

import com.example.javasinhvien.dto.DiemRequestDTO;
import com.example.javasinhvien.dto.DiemResponseDTO;
import com.example.javasinhvien.dto.SinhVienDTO;
import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;
import com.example.javasinhvien.service.DiemService;

@RestController
@RequestMapping("/api/diem")
public class DiemController {

	private final DiemService service;

	public DiemController(DiemService service) {
		this.service = service;
	}

	@GetMapping
	public List<Diem> getAll() {
		return service.getAll();
	}

	@GetMapping("/{masv}/{mamon}/{mahk}")
	public ResponseEntity<?> getById(@PathVariable String masv, @PathVariable String mamon, @PathVariable String mahk) {
		DiemId id = new DiemId(masv, mamon, mahk);
		return service.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody DiemRequestDTO dto) {
		try {
			DiemId id = new DiemId(dto.getMasv(), dto.getMamon(), dto.getMahk());
			Diem diem = new Diem(id, dto.getDiem());
			return ResponseEntity.ok(service.create(diem));
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody DiemRequestDTO dto) {
		try {
			DiemId id = new DiemId(dto.getMasv(), dto.getMamon(), dto.getMahk());
			Diem diem = new Diem(id, dto.getDiem());
			return ResponseEntity.ok(service.update(diem));
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@DeleteMapping("/{masv}/{mamon}/{mahk}")
	public ResponseEntity<?> delete(@PathVariable String masv, @PathVariable String mamon, @PathVariable String mahk) {
		DiemId id = new DiemId(masv, mamon, mahk);
		service.delete(id);
		return ResponseEntity.ok("Đã xoá thành công.");
	}

	@GetMapping("/chuacodiem")
	public ResponseEntity<?> getSinhVienChuaCoDiem(@RequestParam String mamon, @RequestParam String mahk) {
		List<SinhVienDTO> list = service.getSinhVienChuaCoDiem(mamon, mahk);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/danhsach")
	public ResponseEntity<?> getDanhSachDiem(@RequestParam String mamon, @RequestParam String mahk) {
		List<DiemResponseDTO> list = service.getDanhSachDiem(mamon, mahk);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/sinhvien")
	public ResponseEntity<?> getDiemSinhVien(@RequestParam String masv, @RequestParam String mahk) {
		return ResponseEntity.ok(service.getDiemSinhVien(masv, mahk));
	}

}
