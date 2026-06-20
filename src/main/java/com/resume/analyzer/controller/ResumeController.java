package com.resume.analyzer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.resume.analyzer.service.ResumeService;

@RestController
@RequestMapping("/resume")
public class ResumeController {
	
	 @Autowired
	    private ResumeService resumeService;

	 @PostMapping("/upload")
	 public ResponseEntity<String> uploadResume(
	         @RequestParam("file") MultipartFile file,
	         @RequestParam("role") String role) {

	     String result = resumeService.processResume(file, role);
	     return ResponseEntity.ok(result);
	 }
	
}

