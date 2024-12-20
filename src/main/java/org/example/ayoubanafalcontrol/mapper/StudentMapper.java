package org.example.ayoubanafalcontrol.mapper;

import org.example.ayoubanafalcontrol.dao.Student;
import org.example.ayoubanafalcontrol.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper modelMapper=new ModelMapper();
    public StudentDTO toDto(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }
    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}
