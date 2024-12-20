package org.example.ayoubanafalcontrol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class StudentDTO {
    String name;
    String email;
    Date dateNaissance;

//    public StudentDTO() {
//    }
//
//    public StudentDTO(String name, String email, Date dateNaissance) {
//        this.name = name;
//        this.email = email;
//        this.dateNaissance = dateNaissance;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
