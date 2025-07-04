package com.example.javasinhvien.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javasinhvien.dto.DoiMatKhauRequestDTO;
import com.example.javasinhvien.entity.TaiKhoan;
import com.example.javasinhvien.repository.TaiKhoanRepository;
import com.example.javasinhvien.service.TaiKhoanService;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

	@Autowired
	private TaiKhoanRepository taiKhoanRepository;

	@Override
	public Optional<TaiKhoan> login(String username, String password) {
		return taiKhoanRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<TaiKhoan> getAll() {
		return taiKhoanRepository.findAll();
	}

	@Override
	public List<TaiKhoan> findByUsernameAndHoten(String username, String hoten) {
		return taiKhoanRepository.findByUsernameContainingAndHotenContaining(username, hoten);
	}

	@Override
	public TaiKhoan save(TaiKhoan taiKhoan) {
		if (taiKhoanRepository.existsById(taiKhoan.getUsername())) {
			throw new RuntimeException("username đã tồn tại!");
		}
		return taiKhoanRepository.save(taiKhoan);
	}

	@Override
	public TaiKhoan update(String username, TaiKhoan updatedTK) {
		return taiKhoanRepository.findById(username).map(tk -> {
			tk.setPassword(updatedTK.getPassword());
			tk.setRole(updatedTK.getRole());
			tk.setHoten(updatedTK.getHoten());
			return taiKhoanRepository.save(tk);
		}).orElse(null);
	}

	@Override
	public void delete(String username) {
		taiKhoanRepository.deleteById(username);
	}

	@Override
	public String doiMatKhau(DoiMatKhauRequestDTO request) {
		Optional<TaiKhoan> optional = taiKhoanRepository.findById(request.getUsername());

		if (optional.isPresent()) {
			TaiKhoan tk = optional.get();

			if (!tk.getPassword().equals(request.getOldPassword())) {
				throw new RuntimeException("Mật khẩu cũ không đúng!");
			}

			tk.setPassword(request.getNewPassword());
			taiKhoanRepository.save(tk);
			return "Đổi mật khẩu thành công!";
		} else {
			return "Không tìm thấy tài khoản!";
		}
	}
}
