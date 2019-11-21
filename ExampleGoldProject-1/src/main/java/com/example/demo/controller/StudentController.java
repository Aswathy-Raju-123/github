package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;
import com.example.demo.repositry.StudentRepo;



@Controller
public class StudentController {
	@Autowired
	private StudentRepo repo;
	@GetMapping("/")
	public String showHomePage() { 
		System.out.print("mapped correctly");
	return "home";
	}
	@PostMapping("success")
	public String successPage(Student student,Model model) {
		model.addAttribute("s",student);
		repo.save(student);
		System.out.println("/insert mapped");
		return "success";
	}
	@GetMapping("admin/all")
	public String  getStudents(Model model) {
		List<Student> studentsList = new ArrayList<Student>();
		studentsList = repo.findByName("revathy");
		model.addAttribute("studentsList",studentsList);
		return "allStudents";
	}
	
}

