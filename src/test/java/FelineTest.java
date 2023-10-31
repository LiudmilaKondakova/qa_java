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
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testGetFamily(){
        String actual = feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        String expected = "Кошачьи";
        assertEquals("Семья не соответствует", expected, actual);
    }

    @Test
    public void testGetKittens(){
        int actual = feline.getKittens();
        Mockito.verify(feline).getKittens(EXPECTED_KITTENS_COUNT);
        assertEquals("Количество котят не соответствует", EXPECTED_KITTENS_COUNT, actual);
    }

    @Test
    public void testGetKittensCount(){
        int kittensCount = 5;
        int actual = feline.getKittens(kittensCount);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        assertEquals("Количество котят не соответствует", kittensCount,actual);
    }
}
