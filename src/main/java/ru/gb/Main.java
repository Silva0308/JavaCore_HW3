package ru.gb;

import ru.gb.comparators.EmployeeAgeComparator;
import ru.gb.comparators.EmployeeNameComparator;
import ru.gb.comparators.EmployeeSalaryComparator;
import ru.gb.employers.Employee;
import ru.gb.employers.EmployeeList;
import ru.gb.employers.Freelancer;
import ru.gb.employers.Worker;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();

        // Добавление сотрудников в список
        employees.addEmployee(new Worker("Павлов Всеволод Арсентьевич", 35, 20000));
        employees.addEmployee(new Worker("Николаева Ульяна Максимовна", 30, 50000));
        employees.addEmployee(new Worker("Михайлов Георгий Артёмович", 30, 70000));
        employees.addEmployee(new Freelancer("Белоусов Рафаэль Тимофеевич", 28, 700, 20, 8));
        employees.addEmployee(new Freelancer("Любимова Анастасия Дмитриевна", 35, 1000, 15, 6));
        employees.addEmployee(new Worker("Мухин Семён Владимирович", 42, 60000));
        employees.addEmployee(new Freelancer("Мельникова Полина Демидовна", 25, 400, 7, 3));
        employees.addEmployee(new Worker("Ефремов Фёдор Дмитриевич", 33, 55000));
        employees.addEmployee(new Freelancer("Сидорова Алина Егоровна", 29, 200, 18, 8));
        employees.addEmployee(new Worker("Королева Вероника Ярославовна", 38, 65000));
        employees.addEmployee(new Freelancer("Тимофеева Яна Ивановна", 27, 600, 21, 6));
        employees.addEmployee(new Worker("Андрианов Артём Львовича", 31, 52000));


        printSortName("Сортируем по умолчанию");
        Collections.sort(employees.getEmployees());
        printEmployees(employees);

        printSortName("Сортируем по зарплате");
        employees.getEmployees().sort(new EmployeeSalaryComparator());
        printEmployees(employees);

        printSortName("Сортируем по возрасту");
        employees.getEmployees().sort(new EmployeeAgeComparator());
        printEmployees(employees);

        printSortName("Сортируем по имени");
        employees.getEmployees().sort(new EmployeeNameComparator());
        printEmployees(employees);
    }

    /**
     * Печать списка сотрудников
     */
    private static void printEmployees(EmployeeList employeeList) {
        // Итерация по списку сотрудников с использованием цикла foreach
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    /**
     * По сути декоратор, можно вынести в отдельный класс
     */
    private static void printSortName(String st) {
        System.out.println("\n");
        System.out.printf("%25s", "**** " + st + " ***********************\n");
    }
}