package net.example.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.example.sms.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
