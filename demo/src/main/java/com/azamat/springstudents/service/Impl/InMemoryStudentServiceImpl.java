package com.azamat.springstudents.service.Impl;

import com.azamat.springstudents.model.Student;
import com.azamat.springstudents.repository.InMemoryStudentDAO;
import com.azamat.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
//                Student.builder().firstName("Oleg").email("oleg@mail.com").age(41).build(),
//                Student.builder().firstName("Vasai").email("vasia@mail.com").age(51).build(),
//                Student.builder().firstName("Anna").email("anna@mail.com").age(41).build()

    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {


        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }
}
