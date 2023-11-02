import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoesHaveManeTest {
    private static final String MALE = "Самец";
    private static final String FEMALE = "Самка";
    private static Feline feline;
    private static String sex;
    private static boolean hasMane;

    @Before
    public void setUr() {
        feline = Mockito.mock(Feline.class);
    }

    public DoesHaveManeTest(String sex, boolean hasMane) {
        DoesHaveManeTest.sex = sex;
        DoesHaveManeTest.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {MALE, true},
                {FEMALE, false}
        };
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);

    }
}
