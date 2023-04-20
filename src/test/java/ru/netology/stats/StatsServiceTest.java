package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumOfSalesWithValidDate() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };

        int expected = 29;
        int actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesWithDoubleResult() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };

        int expected = 2;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesWithValidDate() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };

        int expected = 9;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesWithValidDate() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };

        int expected = 8;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfMonthsBelowAverageWithValidDate() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };
        int expected = 4;
        int actual = service.countOfMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOfMonthsAboveAverageWithValidDate() {
        StatsService service = new StatsService();

        int[] sales = { 5, 3, 1, 0, 3, 4, 2, 0, 6, 2, 1, 2 };

        int expected = 5;
        int actual = service.countOfMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
