package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}