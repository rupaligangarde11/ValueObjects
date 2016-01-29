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

    @Test
    public void shouldCheckThatTenEuroIsNotEqualToDifferentObjectType() {
        Euro euro = new Euro(10);
        Object object = new Object();
        assertNotEquals(euro,object);

    }

    @Test
    public void shouldCheckThatTenEuroIsEqualToSevenEuroPlusThreeEuro() {
        Euro euro10 = new Euro(10);
        Euro euro7 = new Euro(7);
        Euro euro3 = new Euro(3);
        assertEquals(euro10, euro7.add(euro3));
    }

    @Test
    public void shouldCheckThatTenEuroIsNotEqualToFiveEuroPlusTwoEuro() {
        Euro euro10 = new Euro(10);
        Euro euro5 = new Euro(5);
        Euro euro2 = new Euro(2);
        assertNotEquals(euro10, euro5.add(euro2));

    }

    @Test
    public void shouldCheckThatTenEurosIsNotEqualToTenDollar() {
        Euro euro = new Euro(10);
        Dollar dollar = new Dollar(10);
        assertNotEquals(euro, dollar);
    }


    @Test
    public void shouldCheckThatTenEuroIsEqualToThirteenPointFiveDollars() {
        Euro euro = new Euro(10);
        Dollar dollar = new Dollar(13.5);
        assertEquals(euro, dollar);
    }

}
