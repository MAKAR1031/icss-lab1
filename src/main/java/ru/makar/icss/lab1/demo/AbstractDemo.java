package ru.makar.icss.lab1.demo;

import ru.makar.icss.lab1.model.Group;
import ru.makar.icss.lab1.model.Student;

import java.time.LocalDate;

public abstract class AbstractDemo {

    public abstract void run();

    protected Student createStudent() {
        Group group = new Group();
        group.setName("ИСТм-117");
        group.setDepartmentName("ИСПИ");
        group.setInstituteName("ИИТиР");
        Student student = new Student();
        student.setFirstName("Сергей");
        student.setLastName("Макаров");
        student.setPatronymicName("Андреевич");
        student.setBirthDate(LocalDate.of(1995, 10, 20));
        student.setOnBudget(true);
        student.setGroup(group);
        return student;
    }
}
