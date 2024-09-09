package com.azamat.springstudents.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Student {

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String email;

    private int age;

}
