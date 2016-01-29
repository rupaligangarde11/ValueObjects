import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EuroTest {
    @org.junit.Test
    public void shouldCheckThatTwoEuroValuesAreSame() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(10);
        assertEquals(euro1,euro2);
    }

    @Test
    public void shouldCheckThatTwoEuroValuesAreDifferent() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(5);
        assertNotEquals(euro1, euro2);
    }

    @Test
    public void shouldCheckThatTenEurosIsNotEqualToNull() {
        Euro euro = new Euro(10);
        assertNotEquals(euro, null);
    }
}
