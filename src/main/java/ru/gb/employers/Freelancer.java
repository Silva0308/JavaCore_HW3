package ru.gb.employers;

/**
 * Класс Freelancer представляет сотрудника-фрилансера, который является наследником класа Employee.
 */
public class Freelancer extends Employee {
    //private static final double WORKING_DAYS = 20; // Примем за константу число рабочих дней в месяце
    //private static final double WORKING_HOURS = 8; // Число часов в рабочем дне
    private final double ratePerHour; // Почасовая ставка фрилансера


    private double workingDays;


    private double workingHours;

    /**
     * Конструктор для создания объекта Freelancer.
     *
     * @param name        Имя сотрудника
     * @param age         Возраст сотрудника
     * @param ratePerHour Почасовая ставка сотрудника
     */
    public Freelancer(String name, int age, double ratePerHour, double workingDays, double workingHours) {
        super(name, age, 0); // Нулевая фиксированная оплата для почасовых сотрудников
        this.ratePerHour = ratePerHour;
        this.setType("Freelance");
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }

    public void setWorkingDays(double workingDays) {
        this.workingDays = workingDays;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public double getWorkingDays() {
        return workingDays;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    /**
     * Метод для расчета зарплаты сотрудника-фрилансера.
     *
     * @return Зарплата
     */
    @Override
    public double calculateSalary() {
        return workingDays * workingHours * ratePerHour;
        // return WORKING_DAYS * WORKING_HOURS * ratePerHour;
    }

    /**
     * Метод для получения зарплаты сотрудника-фрилансера.
     *
     * @return Зарплата
     */
    @Override
    public double getSalary() {
        return calculateSalary();
    }
}