package ru.netology.services;

public class FreeService {
    public int calculate(int income, int expenses, int treshold) {
        int money = 0;
        int freemonths = 0;


        for (int i = 0; i < 12; i++) {
            if (money >= treshold) {
                money = money - expenses;
                money = money / 3;
                freemonths++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return freemonths;
    }
    }
