package ru.netology.stats;

public class StatsService {

    public int sumOfAll(int[] arr) {
        int sum = 0;
        for (int i = 0; arr.length > i; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int averageSum(int[] arr) {
        int sum = 0;
        for (int i = 0; arr.length > i; i++) {
            sum = (sum + arr[i]);
        }
        return sum / arr.length;
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

    public int monthWithBelowAverageSales(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int averageSales = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int monthWithAboveAverageSales(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int averageSales = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageSales) {
                count++;
            }
        }
        return count;
    }
}