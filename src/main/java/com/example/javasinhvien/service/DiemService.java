package com.example.javasinhvien.service;

import java.util.List;
import java.util.Optional;

import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;

public interface DiemService {
	List<Diem> getAll();

	Optional<Diem> getById(DiemId id);

	Diem create(Diem diem);

	Diem update(Diem diem);

	void delete(DiemId id);
}
