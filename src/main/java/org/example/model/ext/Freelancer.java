package org.example.model.ext;

import org.example.model.Employee;

import java.sql.Date;

/**
 * тип сотрудника с почасовой оплатой
 */
public class Freelancer extends Employee {

    /**
     * @param salary - почасовая оплата
     */
    public Freelancer(String firstName, String secondName, Date birthDay, double salary) {
        super(firstName, secondName, birthDay, salary);
    }

    @Override
    protected double countSalary(double salary) {
        return 20.8 * 8 * salary;
    }
}
