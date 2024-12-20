package org.example.ayoubanafalcontrol.service;

import org.example.ayoubanafalcontrol.dao.Student;
import org.example.ayoubanafalcontrol.dao.StudentRepository;
import org.example.ayoubanafalcontrol.dto.StudentDTO;
import org.example.ayoubanafalcontrol.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StudentManager implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

//    public StudentManager(StudentRepository studentRepository, StudentMapper studentMapper) {
//        this.studentRepository = studentRepository;
//        this.studentMapper = studentMapper;
//    }

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        studentRepository.save(student);
        return studentMapper.toDto(student);
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.getStudentsByDateNaissance(dateNaissance);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.toDto(student));
        }
        return studentDTOS;
    }
}
