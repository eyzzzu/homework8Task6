package com.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    /*
    6) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
     */

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.00");

        System.out.print("Введите сумму для расчета депозита c процентами: ");
        double money = scr.nextDouble();
        System.out.print("Введите срок депозита в годах: ");
        int year = scr.nextInt();

        System.out.println("Сумма депозита с процентами: " + format.format(deposite(money, year)) + "$");
    }

    private static double deposite(double money, int year) {
        double percent = 0.0;
        for (int i = 0; i < year * 12; i++) {
            percent += 1.5;
        }
        percent = (money * percent) / 100;
        double moneyAndPercent = money + percent;
        return moneyAndPercent;
    }
}
