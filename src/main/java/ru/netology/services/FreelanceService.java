package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0; // количество денег на счету
        int count = 0; // счётчик месяцев отдыха

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // можем ли отдыхать?
                money = money - expenses;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
