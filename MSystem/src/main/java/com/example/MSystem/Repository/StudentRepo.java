package com.example.MSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSystem.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
