package net.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.example.sms.Entity.Student;
import net.example.sms.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
/*		Student student1 = new Student("Ramesh", "Pandey", "ramesh@gmail.com");
		Student student2 = new Student("Suresh", "Sharma", "suresh@gmail.com");
		Student student3 = new Student("Nitesh", "Tiwari", "nitesh@gmail.com");

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		*/
	}
}
