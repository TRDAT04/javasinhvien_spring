package com.example.javasinhvien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasinhvien.entity.HocPhi;
import com.example.javasinhvien.entity.HocPhiId;

public interface HocPhiRepository extends JpaRepository<HocPhi, HocPhiId> {

}
