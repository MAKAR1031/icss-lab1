package ru.makar.icss.lab1.demo.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.makar.icss.lab1.demo.AbstractDemo;
import ru.makar.icss.lab1.model.Student;

public class GsonDemo extends AbstractDemo {

    @Override
    public void run() {
        System.out.println("===== GSON Demo =====");
        Student student = createStudent();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(student);
        String json = gson.toJson(student);
        System.out.println(json);
        Student anotherStudent = gson.fromJson(json, Student.class);
        System.out.println(anotherStudent.equals(student) ? "Объекты эквивалентны" : "Объекты не эквивалентны");
    }
}
