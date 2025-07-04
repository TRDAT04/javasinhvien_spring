package com.example.javasinhvien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.javasinhvien.dto.DiemResponseDTO;
import com.example.javasinhvien.dto.DiemSinhVienDTO;
import com.example.javasinhvien.entity.Diem;
import com.example.javasinhvien.entity.DiemId;

public interface DiemRepository extends JpaRepository<Diem, DiemId> {

	@Query("SELECT new com.example.javasinhvien.dto.DiemResponseDTO(" + "sv.masv, sv.hoten, mh.tenmon, d.diem) "
			+ "FROM DangKyMon dk " + "JOIN SinhVien sv ON sv.masv = dk.masv " + "JOIN Mon mh ON mh.mamon = dk.mamon "
			+ "LEFT JOIN Diem d ON d.id.masv = dk.masv AND d.id.mamon = dk.mamon AND d.id.mahk = dk.mahk "
			+ "WHERE dk.mahk = :mahk AND dk.mamon = :mamon")
	List<DiemResponseDTO> getDanhSachDiem(@Param("mamon") String mamon, @Param("mahk") String mahk);

	List<Diem> findByIdMasvAndIdMahk(String masv, String mahk);

	@Query("""
				SELECT new com.example.javasinhvien.dto.DiemSinhVienDTO(
					m.mamon, m.tenmon,m.sotinchi, d.diem)
				FROM Diem d
				JOIN Mon m ON d.id.mamon = m.mamon
				WHERE d.id.masv = :masv AND d.id.mahk = :mahk
			""")
	List<DiemSinhVienDTO> getDiemSinhVienTheoHocKy(@Param("masv") String masv, @Param("mahk") String mahk);

	List<Diem> findById_Mamon(String mamon);
}
