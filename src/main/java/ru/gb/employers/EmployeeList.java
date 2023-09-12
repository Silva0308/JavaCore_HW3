package ru.gb.employers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс EmployeeList - список работников, имлементирует интерфейс, который позволяет перебирать сотрудников по списку.
 */
public class EmployeeList implements Iterable<Employee> {

    private final List<Employee> employees; // Список сотрудников

    //region Constructor

    /**
     * Конструктор для создания объекта EmployeeList.
     */
    public EmployeeList() {
        employees = new ArrayList<>();
    }

    //endregion

    //region Methods for wokring with employees

    /**
     * Метод для добавления сотрудника в список.
     *
     * @param employee работник для добавления
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Метод для удаления сотрудника из списка.
     *
     * @param employee работник для удаления
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Метод для получения списка всех сотрудников.
     *
     * @return Список сотрудников
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Метод для получения сотрудника по индексу.
     *
     * @param index Индекс сотрудника
     * @return Сотрудник по указанному индексу
     */
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    /**
     * Метод для получения количества сотрудников.
     *
     * @return Количество сотрудников
     */
    public int getEmployeeCount() {
        return employees.size();
    }

    /**
     * Метод для очистки списка сотрудников.
     */
    public void clear() {
        employees.clear();
    }

    //endregion

    /**
     * Метод, возвращающий итератор для использования в циклах foreach.
     *
     * @return Итератор сотрудников
     */
    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}