package ru.makar.icss.lab1.model;

import java.io.Serializable;

public class Group implements Serializable {
    private static final long serialVersionUID = 1604203429921051878L;

    private String instituteName;
    private String departmentName;
    private String name;

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "instituteName='" + instituteName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", name='" + name + '\'' +
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

        Group group = (Group) o;

        if (instituteName != null ? !instituteName.equals(group.instituteName) : group.instituteName != null) {
            return false;
        }
        if (departmentName != null ? !departmentName.equals(group.departmentName) : group.departmentName != null) {
            return false;
        }
        return name != null ? name.equals(group.name) : group.name == null;
    }

    @Override
    public int hashCode() {
        int result = instituteName != null ? instituteName.hashCode() : 0;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
