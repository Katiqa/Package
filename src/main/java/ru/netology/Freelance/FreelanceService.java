package ru.netology.Freelance;

public class FreelanceService {

    public int CalcServ(int income, int expense, int threshold) {
        int currentSum = 0;
        int month = 0;

        for (int i = 1; i <= 12; i++) {
            if (currentSum < threshold) {
                currentSum = income - expense + currentSum;
            } else {
                month = month + 1;
                currentSum = (currentSum - expense) / 3;
            }
        }
        return month;
    }
}