import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void amountSalesTest() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = StatsService.amountSales(resultMonth);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void middleAmountSalesTest() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = StatsService.middleAmountSales(resultMonth);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthMaxSalesTest() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = StatsService.monthMaxSales(resultMonth);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthMinSalesTest() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = StatsService.monthMinSales(resultMonth);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void quantityMonthUnderMidTest() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = StatsService.quantityMonthUnderMid(resultMonth);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void quantityMonthMoreMid() {
        int[] resultMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = StatsService.quantityMonthMoreMid(resultMonth);

        assertEquals(expected, actual);
    }
}

