package ru.netology.Freelance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreeTest {

    @ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/month.csv")
    public void calcFre(int expected, int income, int expense, int threshold) {
        FreelanceService service = new FreelanceService();

        //int expected = 2;
        int actual = service.CalcServ(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
