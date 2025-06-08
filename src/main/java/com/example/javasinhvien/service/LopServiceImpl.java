package com.example.javasinhvien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.entity.Lop;
import com.example.javasinhvien.repository.LopRepository;

@Service
public class LopServiceImpl implements LopService {

	@Autowired
	private LopRepository lopRepository;

	@Override
	public List<Lop> getAll() {
		return lopRepository.findAll();
	}

	@Override
	public Lop getById(String malop) {
		return lopRepository.findById(malop).orElse(null);
	}

	@Override
	public Lop create(Lop lop) {
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
	public List<Lop> searchByTenlop(String tenlop) {
		return lopRepository.findByTenlopContainingIgnoreCase(tenlop);
	}

	@Override
	public List<Lop> searchByKhoa(String khoa) {
		return lopRepository.findByKhoaContainingIgnoreCase(khoa);
	}
}
