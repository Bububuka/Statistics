package ru.netology.stats;

public class StatsService {

    public long sumOfAll(long[] arr) {
        long sum = 0;
        for (long sale : arr) {
            sum += sale;
        }
        return sum;
    }

    public long averageSum(long[] arr) {
        return sumOfAll(arr) / arr.length;
    }


    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthWithBelowAverageSales(long[] arr) {
        int count = 0;
        for (long l : arr) {
            if (l < averageSum(arr)) {
                count++;
            }
        }
        return count;
    }

    public int monthWithAboveAverageSales(long[] arr) {
        int count = 0;
        for (long l : arr) {
            if (l > averageSum(arr)) {
                count++;
            }
        }
        return count;
    }
}