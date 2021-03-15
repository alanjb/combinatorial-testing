import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import swe637.java.Cal;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalTest {
    int month1;
    int day1;
    int month2;
    int day2;
    int year;
    int numDays;

    public CalTest(int month1, int day1, int month2, int day2, int year, int numDays){
        this.month1 = month1;
        this.day1 = day1;
        this.month2 = month2;
        this.day2 = day2;
        this.year = year;
        this.numDays = numDays;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters(){
        return Arrays.asList(new Object[][] {
                //Pairwise Tests
                {1,1,1,3,2001,2},
                {1,1,4,1,2000,91},
                {1,1,4,1,2003,90},
        });
    }

    @Test
    public void testCal(){
        assertEquals(numDays, Cal.cal(month1,day1,month2,day2,year));
    }
}