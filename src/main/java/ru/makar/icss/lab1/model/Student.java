package ru.makar.icss.lab1.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
    private static final long serialVersionUID = -7629064496372095288L;

    private String firstName;
    private String lastName;
    private String patronymicName;
    private LocalDate birthDate;
    private boolean onBudget;
    private Group group;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isOnBudget() {
        return onBudget;
    }

    public void setOnBudget(boolean onBudget) {
        this.onBudget = onBudget;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", birthDate=" + birthDate +
                ", onBudget=" + onBudget +
                ", group=" + group +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (onBudget != student.onBudget) {
            return false;
        }
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) {
            return false;
        }
        if (patronymicName != null ? !patronymicName.equals(student.patronymicName) : student.patronymicName != null) {
            return false;
        }
        return (birthDate != null ? birthDate.equals(student.birthDate) : student.birthDate == null) && (group != null ? group
                .equals(student.group) : student.group == null);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronymicName != null ? patronymicName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (onBudget ? 1 : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }
}
