package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumOfAll() {
        StatsService service = new StatsService();

        int[] sum = {145, 156, 345, 234, 134, 321, 187, 181, 165, 148, 133, 189};

        int expectedSum = 2338;
        int actualSum = service.sumOfAll(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();

        int[] sum = {145, 156, 345, 234, 134, 321, 187, 181, 165, 148, 133, 189};

        int expectedSum = 194;
        int actualSum = service.averageSum(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] month = {12_000, 9_000, 7_500, 19_000, 3_323, 12_570, 17_000};

        int expectedMonth = 4;
        long actualMonth = service.maxMonth(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] month = {12_000, 9_000, 7_500, 19_000, 37_323, 12_570, 17_000};

        int expectedMonth = 3;
        long actualMonth = service.minMonth(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sum = {137, 255, 211, 111};

        int expectedSum = 2;
        int actualSum = service.monthWithBelowAverageSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sum = {137, 155, 211, 111, 5};

        int expectedSum = 3;
        int actualSum = service.monthWithAboveAverageSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }


}