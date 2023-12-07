package org.example;

import org.example.model.Employee;
import org.example.model.Staff;
import org.example.model.ext.Freelancer;
import org.example.model.ext.Worker;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Staff<Employee> employees = new Staff<>();
        employees
                .add(new Freelancer
                        ("Alan", "Wake", new Date(1995, 11, 7), 1950.84))
                .add(new Freelancer
                        ("Peter", "Jackson", new Date(1961, 10, 31), 1050.45))
                .add(new Worker
                        ("Guy", "Ritchie", new Date (1968, 9, 10), 170_000))
                .add(new Worker
                        ("Christopher", "Nolan", new Date(1970, 7, 30), 156_000));
        employees.print();
        System.out.println("Сортируем по зп...");
        employees.sort();
        employees.print();
    }
}