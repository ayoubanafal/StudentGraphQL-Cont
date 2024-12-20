package org.example.ayoubanafalcontrol.dao;

import org.example.ayoubanafalcontrol.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> getStudentsByDateNaissance(Date dateNaissance);
}
