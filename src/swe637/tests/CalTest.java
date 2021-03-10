import org.junit.Test;
import swe637.java.Cal;

import static org.junit.Assert.*;

public class CalTest {

    //Pairwise Tests
    @Test
    public void testCal_C1() { // (C1T, C1F, C1F) constraint: C1T -> !(C2T) ^ !(C3T)
        int month1 = 1;
        int day1 = 1;
        int month2 = 1;
        int day2 = 3;
        int year = 2001;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(2, numDays);
    }

    @Test
    public void testCal_C2() { // (C1F, C2T, C2F) constraint: C2T -> !(C1T) ^ !(C3T)
        int month1 = 1;
        int day1 = 1;
        int month2 = 4;
        int day2 = 1;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(91, numDays);
    }

    @Test
    public void testCal_C3() { // C1F, C2F, C2T
        int month1 = 1;
        int day1 = 1;
        int month2 = 4;
        int day2 = 1;
        int year = 2003;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(90, numDays);
    }
}