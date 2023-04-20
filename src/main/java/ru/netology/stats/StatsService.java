package ru.netology.stats;

public class StatsService {

    public int sumOfSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        return sumOfSales(sales)/sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countOfMonthsBelowAverage(int[] sales) {
        int average = averageSales(sales);
        int monthsBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int countOfMonthsAboveAverage(int[] sales) {
        int average = averageSales(sales);
        int monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }

}
