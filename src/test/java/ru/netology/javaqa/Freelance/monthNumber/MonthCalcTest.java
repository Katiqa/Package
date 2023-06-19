package ru.netology.javaqa.Freelance.monthNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Month.csv")
    void freeMonthCalc(int income, int expense, int threshold, int expected) {
        MonthService calc = new MonthService();
        int actual = calc.calculation(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
