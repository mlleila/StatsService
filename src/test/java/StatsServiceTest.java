import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'registered user, bonus under limit', 10060, true, 30",
            "'registered user, bonus over limit', 100000060, true, 500"
    },
            delimiter = ',')


    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSum(purchases);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateNumberOfMonthWithMaxPurchases() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.numberOfMonthWithMaxPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthWithMinPurchases() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.numberOfMonthWithMinPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthsUnderAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsUnderAverageSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthsOverAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsOverAverageSum(purchases);
        assertEquals(expected, actual);
    }
}