package ru.netology.Freelance;

public class Main {
    public static void main(String[] args) {
        FreelanceService serv = new FreelanceService();

        int month = serv.CalcServ(10000, 3000, 20000);
        System.out.println("Можно отдыхать " + month + " месяца");
    }
}
