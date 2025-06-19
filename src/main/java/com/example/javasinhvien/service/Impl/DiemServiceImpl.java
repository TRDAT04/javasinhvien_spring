package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;
import com.example.javasinhvien.repository.DiemRepository;
import com.example.javasinhvien.service.DiemService;

@Service
public class DiemServiceImpl implements DiemService {

	private final DiemRepository repository;

	public DiemServiceImpl(DiemRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Diem> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Diem> getById(DiemId id) {
		return repository.findById(id);
	}

	@Override
	public Diem create(Diem diem) {
		if (repository.existsById(diem.getId())) {
			throw new RuntimeException("Điểm đã tồn tại.");
		}
		return repository.save(diem);
	}

	@Override
	public Diem update(Diem diem) {
		if (!repository.existsById(diem.getId())) {
			throw new RuntimeException("Không tìm thấy để cập nhật.");
		}
		return repository.save(diem);
	}

	@Override
	public void delete(DiemId id) {
		repository.deleteById(id);
	}
}
