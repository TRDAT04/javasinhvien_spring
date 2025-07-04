package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Lop;
import com.example.javasinhvien.repository.LopRepository;
import com.example.javasinhvien.service.LopService;

@Service
public class LopServiceImpl implements LopService {

	@Autowired
	private LopRepository lopRepository;

	@Override
	public List<Lop> getAll() {
		return lopRepository.findAll();
	}

	@Override
	public Optional<Lop> getById(String malop) {
		return lopRepository.findById(malop);
	}

	@Override
	public Lop create(Lop lop) {
		if (lopRepository.existsById(lop.getMalop())) {
			throw new RuntimeException("Mã lớp đã tồn tại!");
		}
		return lopRepository.save(lop);
	}

	@Override
	public Lop update(String malop, Lop lop) {
		if (!lopRepository.existsById(malop))
			return null;
		lop.setMalop(malop); // ensure ID consistency
		return lopRepository.save(lop);
	}

	@Override
	public void delete(String malop) {
		lopRepository.deleteById(malop);
	}

	@Override
	public List<Lop> searchByMalopAndTenlop(String malop, String tenlop) {
		return lopRepository.findByMalopContainingAndTenlopContaining(malop, tenlop);
	}

}
