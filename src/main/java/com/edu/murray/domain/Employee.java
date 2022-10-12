package com.edu.murray.domain;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author hp
 */

@Repository
public class Employee {
    private int emp_no;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    private LocalDate birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private LocalDate hire_date;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_no=" + emp_no +
                ", birth_date=" + birth_date +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", hire_date=" + hire_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employees = (Employee) o;
        return getEmp_no() == employees.getEmp_no() && Objects.equals(getBirth_date(), employees.getBirth_date()) && Objects.equals(getFirst_name(), employees.getFirst_name()) && Objects.equals(getLast_name(), employees.getLast_name()) && Objects.equals(getGender(), employees.getGender()) && Objects.equals(getHire_date(), employees.getHire_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp_no(), getBirth_date(), getFirst_name(), getLast_name(), getGender(), getHire_date());
    }
}
