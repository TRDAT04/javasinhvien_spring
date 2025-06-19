package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.javasinhvien.entity.Mon;

public interface MonHocRepository extends JpaRepository<Mon, String> {
	List<Mon> findByMamonContainingAndTenmonContaining(String mamon, String tenmon);

	@Query("""
			   SELECT m FROM Mon m
			   WHERE m.mamon NOT IN (
			     SELECT d.mamon FROM DangKyMon d WHERE d.masv = :masv
			   )
			""")
	List<Mon> findMonChuaDangKyByMasv(@Param("masv") String masv);

	@Query("""
			    SELECT m FROM Mon m
			    WHERE m.mamon IN (
			        SELECT d.mamon FROM DangKyMon d
			        WHERE d.masv = :masv AND d.mahk = :mahk
			    )
			""")
	List<Mon> findMonHocDaDangKy(@Param("masv") String masv, @Param("mahk") String mahk);

	@Query("SELECT m FROM Mon m WHERE m.mamon IN "
			+ "(SELECT dk.mamon FROM DangKyMon dk WHERE dk.masv = :masv AND dk.mahk = :mahk)")

	List<Mon> findByMasvAndMahk(@Param("masv") String masv, @Param("mahk") String mahk);

	@Query("""
			    SELECT m FROM Mon m
			    WHERE m.mamon IN (
			        SELECT d.mamon FROM DangKyMon d
			        WHERE d.masv = :masv AND d.mahk = :mahk
			    )
			""")
	List<Mon> findMonByMasvAndMahk(@Param("masv") String masv, @Param("mahk") String mahk);
}
