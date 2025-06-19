package com.example.javasinhvien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;

public interface DangKyMonRepository extends JpaRepository<DangKyMon, DangKyMonId> {

}
