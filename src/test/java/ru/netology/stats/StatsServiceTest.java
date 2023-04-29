package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testSumSalesInYear() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSumSalesInYear(salesMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMiddleSalesInMonth() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateMiddleSalesInMonth(salesMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxSalesMonth(salesMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMinSalesMonth() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMinSalesMonth(salesMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testUnderMiddleSales() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateUnderMiddleSales(salesMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverMiddleSales() {
        StatsService service = new StatsService();

        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateOverMiddleSales(salesMonth);

        Assertions.assertEquals(expected, actual);
    }
}
