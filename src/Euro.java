public class Euro {
    public final double amount;
    private double conversionFactor;
    public Euro(int amount) {
        this.amount = amount;
        conversionFactor = 1.35;
    }

    public Euro(double amount) {
        this.amount = amount;
        conversionFactor = 1.35;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(o.getClass() == Dollar.class) {
            Dollar dollar = (Dollar) o;
            return (dollar.amount == this.amount * conversionFactor);
        }

        if(getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;
        return amount == euro.amount;



    }

    public Euro add(Euro euro) {
        return new Euro(amount+euro.amount);
    }



}
