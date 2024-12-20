package org.example.ayoubanafalcontrol.service;

import org.example.ayoubanafalcontrol.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
StudentDTO saveStudent(StudentDTO studentDTO);
List<StudentDTO> getStudentByDateNaissance(Date dateNaissance);
}
