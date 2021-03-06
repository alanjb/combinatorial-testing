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
                {1,15,12,5,2000,325},
                {1,15,12,15,2001,334},
                {1,15,12,5,2004,325},
                {1,15,12,15,2100,334},
                {2,15,12,15,2000,304},
                {2,15,12,5,2001,293},
                {2,15,12,15,2004,304},
                {2,15,12,5,2100,293},
                {3,15,12,15,2000,275},
                {3,15,12,5,2001,265},
                {3,15,12,5,2004,265},
                {3,15,12,5,2100,265},
                {4,15,12,15,2000,244},
                {4,15,12,5,2001,234},
                {4,15,12,15,2004,244},
                {4,15,12,5,2100,234},
                {5,15,12,15,2000,214},
                {5,15,12,5,2001,204},
                {5,15,12,5,2004,204},
                {5,15,12,15,2100,214},
                {6,15,12,15,2000,183},
                {6,15,12,5,2001,173},
                {6,15,12,5,2004,173},
                {6,15,12,15,2100,183},
                {7,15,12,15,2000,153},
                {7,15,12,5,2001,143},
                {7,15,12,5,2004,143},
                {7,15,12,5,2100,143},
                {8,15,12,15,2000,122},
                {8,15,12,5,2001,112},
                {8,15,12,15,2004,122},
                {8,15,12,15,2100,122},
                {9,15,12,15,2000,91},
                {9,15,12,5,2001,81},
                {9,15,12,15,2004,91},
                {9,15,12,5,2100,81},
                {10,15,12,15,2000,61},
                {10,15,12,5,2001,51},
                {10,15,12,5,2004,51},
                {10,15,12,5,2100,51},
                {11,15,12,15,2000,30},
                {11,15,12,5,2001,20},
                {11,15,12,5,2004,20},
                {11,15,12,15,2100,30},
                {12,15,12,15,2000,0},
                {12,15,12,15,2001,0},
                {12,15,12,15,2004,0},
                {12,15,12,15,2100,0},
        });
    }

    @Test
    public void testCal(){
        assertEquals(numDays, Cal.cal(month1,day1,month2,day2,year));
    }
}