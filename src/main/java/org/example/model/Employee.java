package org.example.model;

import java.sql.Date;
import java.time.LocalDate;

/**
 * родительский абстрактный тип сотрудника
 */
public abstract class Employee implements Comparable<Employee> {
    protected String firstName;
    protected String secondName;
    protected Date birthDay;
    protected double salary;

    public Employee(String firstName, String secondName, Date birthDay, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.salary = countSalary(salary);
    }

    protected abstract double countSalary(double salary);

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Возраст: %d, Ежемесячная заработная плата: %.2f",
                this.firstName, this.secondName, LocalDate.now().getYear() - this.birthDay.getYear(), this.salary);
    }
}
