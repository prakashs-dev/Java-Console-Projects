package com.example.MSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MSystem.Entity.Student;
import com.example.MSystem.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentServie;
	
	@RequestMapping("/")
	public List<Student> getAllStudent(){
		return studentServie.allStudents();
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		
		String result = studentServie.addStudent(student);
		return new ResponseEntity<>(result,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public Student getStudentId(@PathVariable int id) throws Exception {
		return studentServie.getStudentId(id);
	}
	
	
	@PutMapping("/update/{id}")
    public ResponseEntity<String> updateItem(@PathVariable int id, @RequestBody Student student) throws Exception {
        if (studentServie.getStudentId(id) != null) {
        	student.setId(id);
            return ResponseEntity.ok(studentServie.addStudent(student));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) throws Exception {
        if (studentServie.getStudentId(id) != null) {
        	studentServie.deleteStudent(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	
}
