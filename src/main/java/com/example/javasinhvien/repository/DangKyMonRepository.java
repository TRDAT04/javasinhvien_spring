package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.javasinhvien.dto.SinhVienDTO;
import com.example.javasinhvien.entity.DangKyMon;
import com.example.javasinhvien.entity.DangKyMonId;

public interface DangKyMonRepository extends JpaRepository<DangKyMon, DangKyMonId> {
	@Query("SELECT new com.example.javasinhvien.dto.SinhVienDTO(sv.masv, sv.hoten) " + "FROM DangKyMon dk "
			+ "JOIN SinhVien sv ON dk.id.masv = sv.masv " + "WHERE dk.id.mamon = :mamon AND dk.id.mahk = :mahk "
			+ "AND NOT EXISTS ("
			+ "   SELECT d FROM Diem d WHERE d.id.masv = dk.id.masv AND d.id.mamon = dk.id.mamon AND d.id.mahk = dk.id.mahk"
			+ ")")
	List<SinhVienDTO> findSinhVienChuaCoDiem(@Param("mamon") String mamon, @Param("mahk") String mahk);

	List<DangKyMon> findByMasvAndMahk(String masv, String mahk);

	List<DangKyMon> findByMasvAndMamon(String masv, String mamon);
}
