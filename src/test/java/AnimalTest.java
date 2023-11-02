import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;


/** @noinspection ALL*/
public class AnimalTest {
    private Animal animal;
    private static final String UNSUPPORTED_ANIMAL_KIND = "unsupported animal kind";
    private static final String TEXT_EXCEPTION = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    private static final String FAMILY = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Before
    public void setUp(){
        animal = new Animal();
    }

    @Test
    public void testGetFamily() throws Exception {
        String actual = animal.getFamily();
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", FAMILY, actual);
    }

    @Test
    public void testGetFoodException() {
         Throwable throwables = catchThrowable(() -> animal.getFood(UNSUPPORTED_ANIMAL_KIND));
        assertThat(throwables)
                .isInstanceOf(Exception.class)
                .hasMessage(TEXT_EXCEPTION);
    }
}
