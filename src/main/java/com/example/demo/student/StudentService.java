package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Silva",
                        "Silva@gmail.com",
                        LocalDate.of(1998, Month.FEBRUARY, 12),
                        24
                ),
                new Student(
                        2L,
                        "Meg",
                        "meg@gmail.com",
                        LocalDate.of(1998, Month.NOVEMBER, 12),
                        24
                )

        );
    }
}
