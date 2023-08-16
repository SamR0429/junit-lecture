import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CoffeeTest {

    private double deltaValue = 0.000001;
    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    @Before
    public void setup(){
        actualCoffee = new Coffee("the bean-i-nator", "expresso", 5.99);
    }

    @Test
    public void testCoffeeConstructor(){
        actualCoffee = new Coffee();
        //assert that empty coffee is null
        assertNull(emptyCoffee);

        //assert that actual coffee is not null
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgConstructor(){
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeGetters(){
        assertEquals(actualCoffee.getName(), "the bean-i-nator");
        assertEquals(actualCoffee.getRoast(), "expresso");
        assertEquals(actualCoffee.getPrice(), 5.99, deltaValue);
    }

    @Test
    public void testCoffeeSetters(){
        actualCoffee.setName("the bean-i-nator");
        assertEquals(actualCoffee.getName(),"the bean-i-nator");
        actualCoffee.setRoast("dark");
        assertEquals(actualCoffee.getRoast(), "dark");
        actualCoffee.setPrice(5.99);
        assertEquals(actualCoffee.getPrice(), 5.99, deltaValue);
    }


}
