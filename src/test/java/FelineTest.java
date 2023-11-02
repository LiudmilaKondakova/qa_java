import com.example.Feline;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {
    private static final int EXPECTED_KITTENS_COUNT = 1;

    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception{
        feline.eatMeat();
    }

    @Test
    public void testGetFamily(){
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Семья не соответствует", expected, actual);
    }

    @Test
    public void testGetKittens(){
        int actual = feline.getKittens();
        assertEquals("Количество котят не соответствует", EXPECTED_KITTENS_COUNT, actual);
    }

    @Test
    public void testGetKittensCount(){
        int kittensCount = 5;
        int actual = feline.getKittens(kittensCount);
        assertEquals("Количество котят не соответствует", kittensCount,actual);
    }
}
