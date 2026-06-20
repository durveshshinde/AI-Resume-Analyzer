package com.resume.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resume.analyzer.model.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
