package ru.netology.javaqa.Freelance.monthNumber;

public class MonthService {
    public int calculation(int income, int expense, int threshold) {
        int month = 0;
        int cureentSum = 0;

        for (int i = 1; i <= 12; i++) {
            if (cureentSum < threshold) {
                cureentSum = cureentSum + income - expense;
            } else {
                month = month + 1;
                cureentSum = (cureentSum - expense) / 3;
            }
        }

        return month;
    }

}
