package ru.netology.javaqa.Freelance.monthNumber;

public class Main {

    public static void main(String[] args) {
        MonthService service = new MonthService();
        int month = service.calculation(10000, 3000, 20000);
        System.out.println("Можно отдыхать " + month + " месяца");
    }
}
