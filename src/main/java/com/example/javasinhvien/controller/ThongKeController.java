package com.example.javasinhvien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javasinhvien.dto.ThongKeMonHocDTO;
import com.example.javasinhvien.service.ThongKeService;

@RestController
@RequestMapping("/api/thongke")
public class ThongKeController {
	@Autowired
	private ThongKeService thongKeService;

	@GetMapping("/tyle-dat")
	public List<ThongKeMonHocDTO> getTyLeDatMon() {
		return thongKeService.thongKeTyLeDatMon();
	}
}
