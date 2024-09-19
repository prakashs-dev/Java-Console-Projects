package com.example.MSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSystem.Entity.Student;
import com.example.MSystem.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> allStudents(){
		return studentRepo.findAll();
	}

	public String addStudent(Student student) {
		Student stu = studentRepo.save(student);
		return "The Student has " + stu.getId() + " been Saved Successfully";
	}

	public Student getStudentId(int id) throws Exception {
		Optional<Student> optionalStudent = studentRepo.findById(id);

		if (optionalStudent.isEmpty()) {
			throw new Exception("Student ID is Incorrected");
		}

		Student studentId = optionalStudent.get();
		return studentId;
	}

	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}
}
