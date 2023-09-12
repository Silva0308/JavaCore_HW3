package ru.gb.employers;


import java.util.Random;

/**
 * Класс Employee представляет абстрактного сотрудника с базовой информацией, такой как имя, возраст и зарплата.
 */
public abstract class Employee implements Comparable<Employee> {

    //region Private Fields

    private String name; // Имя сотрудника
    private int age; // Возраст сотрудника
    private double salary; // Зарплата сотрудника
    private String type; // тип сотрудника

    //endregion

    //region Constructor

    /**
     * Конструктор для создания объекта Employee.
     *
     * @param name   Имя сотрудника
     * @param age    Возраст сотрудника
     * @param salary Зарплата сотрудника
     */
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //endregion

    //region Abctract Methods

    /**
     * Метод для расчета зарплаты сотрудника.
     *
     * @return Зарплата сотрудника
     */
    public abstract double calculateSalary();

    /**
     * Метод сравнения двух сотрудников.
     * Сравнение идет последовательно по полям: имя, возраст, зарплата
     *
     * @param some передаем сотрудника, которого сравниваем
     * @return Результат сравнения:
     * -1, если данный сотрудник должен быть в списке раньше другого сотрудника;
     * 0, если не важен порядок (сотрудники равны)
     * 1, если данный сотрудник должен быть в списке позже другого сотрудника.
     * @throws NullPointerException Если такого сотрудника нет
     */
    public int compareTo(Employee some) {
        if (some == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        int nameComparison = this.name.compareTo(some.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        int ageComparison = Integer.compare(this.age, some.age);
        if (ageComparison != 0) {
            return ageComparison;
        }

        return Double.compare(this.calculateSalary(), some.calculateSalary());
    }
    @Override
    public String toString() {
        return String.format("%-20s  возраст = %-3d  зарплата = %-9.2f  type = %s", name, age, calculateSalary(), type);
    }
    //endregion

    // region Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setType(String type) {
        this.type = type;
    }
    //endregion


}

