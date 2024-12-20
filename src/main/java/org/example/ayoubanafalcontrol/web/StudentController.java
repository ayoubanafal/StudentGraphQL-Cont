package org.example.ayoubanafalcontrol.web;

import lombok.AllArgsConstructor;
import org.example.ayoubanafalcontrol.dao.Student;
import org.example.ayoubanafalcontrol.dto.StudentDTO;
import org.example.ayoubanafalcontrol.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }
    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String date) throws ParseException {
        Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return studentService.getStudentByDateNaissance(parsedDate);
    }
}
