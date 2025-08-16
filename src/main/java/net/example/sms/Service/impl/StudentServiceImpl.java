package net.example.sms.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.example.sms.Entity.Student;
import net.example.sms.Repository.StudentRepository;
import net.example.sms.Service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{

	private StudentRepository studentRepository;
	//AUTOWIRED KA USE YAHA NAHI KIYA GAYA HAI
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		
	return studentRepository.findAll();
	}	
	
	public Student saveStudent(Student student)
	{
		return studentRepository.save(student);
	}
	

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}


