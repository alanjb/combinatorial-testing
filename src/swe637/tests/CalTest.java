import org.junit.Test;
import swe637.java.Cal;

import static org.junit.Assert.*;

public class CalTest {

    /**
     * m1=1
     * leapYear=false
     * d1Relationd2=d1<d2
     * m2minusm1=1
     * */

    @Test
    public void testCal1() { // 1/2 -> 2/3 (31 + 2 = 33)
        int month1 = 1;
        int day1 = 1;
        int month2 = 2;
        int day2 = 3;
        int year = 2001;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }

//    @Test
//    public void testCal() { // 1/2 -> 2/29 (30 + 28 = 59)
//        int month1 = 1;
//        int day1 = 1;
//        int month2 = 2;
//        int day2 = 28;
//        int year = 2001;
//        int numDays = Cal.cal(month1, day1, month2, day2, year);
//
//        //should fail
//        assertEquals(59, numDays);
//    }

    /**
     * m1 = 1
     * leapYear = true
     * d1Relationd2 = d1==d2
     * m2minusm1 = 1
     * */

    @Test
    public void testCal2() { // 1/31 -> 2/3 (31 - (31- (29 - )))
        int month1 = 1;
        int day1 = 31;
        int month2 = 2;
        int day2 = 3;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(3, numDays);
    }

    /**
     * m1 = 1
     * leapYear = true
     * d1Relationd2 = d1==d2
     * m2minusm1 = 1
     * */

    @Test
    public void testCal3() { // 1/2 -> 2/29 (31 + 2 = 33)
        int month1 = 1;
        int day1 = 1;
        int month2 = 2;
        int day2 = 29;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }

    @Test
    public void testCal4() { // 1/2 -> 2/29 (31 + 2 = 33)
        int month1 = 2;
        int day1 = 1;
        int month2 = 2;
        int day2 = 2;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }

    @Test
    public void testCal5() { // 1/2 -> 2/29 (31 + 2 = 33)
        int month1 = 2;
        int day1 = 1;
        int month2 = 2;
        int day2 = 2;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }

    @Test
    public void testCal6() { // 1/2 -> 2/29 (31 + 2 = 33)
        int month1 = 2;
        int day1 = 1;
        int month2 = 2;
        int day2 = 2;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }

    @Test
    public void testCal7() { // 1/2 -> 2/29 (31 + 2 = 33)
        int month1 = 1;
        int day1 = 1;
        int month2 = 3;
        int day2 = 10;
        int year = 2000;
        int numDays = Cal.cal(month1, day1, month2, day2, year);

        assertEquals(33, numDays);
    }
}