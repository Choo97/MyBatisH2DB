package com.study.springBoot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.springBoot.jdbc.Board;
import com.study.springBoot.jdbc.BoardMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MyController {
	
	final BoardMapper boardMapper;

	@GetMapping("/test1")
	public void ex1(Model model) {
		List<Board> blst = boardMapper.findAll();
		
		model.addAttribute("ddd", blst);
		
	}
	
	@GetMapping("/test2")
	public String ex2(Model model) {
		model.addAttribute("ddd", "테스트");
		return "test1";
		
	}
}
