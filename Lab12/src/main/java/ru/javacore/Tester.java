package ru.javacore;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("- ФИ: " + name + " " + surname);
        System.out.println("- Опыт работы: " + expirienceInYears);
        System.out.println("- Уровень английского: " + englishLevel);
        System.out.println("- Зарплата: " + salary);
        System.out.println("========================");
    }

    public void printInfo(String title) {
        System.out.println(title);
        System.out.println("========================");
        printInfo();
    }

    public double calculateSalary(double rate) {
        return rate * expirienceInYears * salary;
    }

    public static void printGreetings() {
        System.out.println("========================ХЕЛЛОУ МИР========================");
    }
    public static void printGreetings(String str) {
        System.out.println("========================" + str + "========================");
    }
}

