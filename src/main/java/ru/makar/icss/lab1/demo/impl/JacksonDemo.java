package ru.makar.icss.lab1.demo.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ru.makar.icss.lab1.demo.AbstractDemo;
import ru.makar.icss.lab1.model.Student;

import java.io.IOException;

public class JacksonDemo extends AbstractDemo {
    @Override
    public void run() {
        System.out.println("===== Jackson Demo =====");
        try {
            Student student = createStudent();
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String json = mapper.writeValueAsString(student);
            System.out.println(student);
            System.out.println(json);
            Student anotherStudent = mapper.readValue(json, Student.class);
            System.out.println(anotherStudent.equals(student) ? "Объекты эквивалентны" : "Объекты не эквивалентны");
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
