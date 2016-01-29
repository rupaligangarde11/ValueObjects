import java.awt.font.OpenType;
import java.util.Objects;

public class Euro {
    private final int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return amount == euro.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }
}
