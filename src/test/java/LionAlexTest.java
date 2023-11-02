import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
    public class LionAlexTest {
    @Mock
    private Feline feline;
    private LionAlex lionAlex;
    private final List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");

    @Test
    public void testGetKittens() throws Exception {
        lionAlex = new LionAlex(feline);
        int actual = lionAlex.getKittens();
        int expectedLittleLion = 0;
        assertEquals("Количество львят не соответствует", expectedLittleLion, actual);
    }
    @Test
    public void testGetOfLiving() throws Exception {
        lionAlex = new LionAlex(feline);
        String actual = lionAlex.getPlaceOfLiving();
        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals("Место проживания не соответствует", expectedPlace, actual);
    }
    @Test
    public void testGetFriends() throws Exception {
        lionAlex = new LionAlex(feline);
        List<String> actual = lionAlex.getFriends();
        assertEquals("Список друзей не соответствует", expectedFriends, actual);
    }
}
