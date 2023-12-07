package org.example.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Класс на основе списка сотрудников
 *
 * @param <T> - тип сотрудника
 */
public class Staff<T extends Comparable<T>> implements Iterable<T> {
    private final List<T> employees;

    public Staff() {
        this.employees = new ArrayList<>();
    }

    /**
     * @return new Iterator<T> - анонимный класс итератора
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < employees.size();
            }

            @Override
            public T next() {
                return employees.get(index++);
            }
        };
    }

    public Staff<T> add(T t) {
        employees.add(t);
        return this;
    }

    /**
     * метод вывода списка сотрудников
     */
    public void print() {
        for (T t : employees) {
            System.out.println(t);
        }
    }

    /**
     * метод сортировки сотрудников
     */
    public void sort() {
        Collections.sort(employees);
    }
}
