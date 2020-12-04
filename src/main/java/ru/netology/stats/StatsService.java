package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases){
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum/12;
    }

    public long numberOfMonthWithMaxPurchases(long[] purchases) {
        long max = purchases[0];
        long indexForMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            long purchase = purchases[i];
            if (max <= purchase) {
                max = purchase;
                indexForMax = i;
            }
        }
        return indexForMax;
    }

    public long numberOfMonthWithMinPurchases(long[] purchases) {
        long min = purchases[0];
        long indexForMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            long purchase = purchases[i];
            if (min > purchase) {
                min = purchase;
                indexForMax = i;
            }
        }
        return indexForMax;
    }

    public long numberOfMonthsUnderAverageSum(long[] purchases) {
        long sum = 0;
        long months = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averageSum = sum/12;
        for (long purchase : purchases) {
            if (purchase < averageSum) {
                months++;
            }
        }
        return months;
    }

    public long numberOfMonthsOverAverageSum(long[] purchases) {
        long sum = 0;
        long months = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averageSum = sum / 12;
        for (long purchase : purchases)
        {
            if (purchase > averageSum)
            {
                months++;
            }
        }

        return months;
    }
}