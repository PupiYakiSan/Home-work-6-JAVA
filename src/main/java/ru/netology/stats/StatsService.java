package ru.netology.stats;

public class StatsService {

    public long calculateSumSalesInYear (long[] salesMonth) {
        long sumSalesYear = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sumSalesYear = sumSalesYear + salesMonth[i];
        }
        return sumSalesYear;
    }

    public long calculateMiddleSalesInMonth (long[] salesMonth) {
        return calculateSumSalesInYear(salesMonth) / 12;
    }

    public int calculateMaxSalesMonth (long[] salesMonth) {
        int maxSalesMonth = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= salesMonth[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        maxSalesMonth = maxSalesMonth + 1;
        return maxSalesMonth;
    }

    public int calculateMinSalesMonth (long[] salesMonth) {
        int minSalesMonth = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] <= salesMonth[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        minSalesMonth = minSalesMonth + 1;
        return minSalesMonth;
    }

    public int calculateUnderMiddleSales (long[] salesMonth) {
        long middleSalesInMonth = calculateMiddleSalesInMonth(salesMonth);
        int count = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] < middleSalesInMonth) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calculateOverMiddleSales (long[] salesMonth) {
        long middleSalesInMonth = calculateMiddleSalesInMonth(salesMonth);
        int count = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] > middleSalesInMonth) {
                count = count + 1;
            }
        }
        return count;
    }

}
