package com.example.javasinhvien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;

public interface DiemRepository extends JpaRepository<Diem, DiemId> {

}
