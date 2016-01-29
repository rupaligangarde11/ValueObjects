import java.util.Objects;

public class Euro {
    private final int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

  @Override
    public boolean equals(Object object){
      if(object==null) return false;
      Euro euro = (Euro) object;
      return amount == euro.amount;
  }
}
