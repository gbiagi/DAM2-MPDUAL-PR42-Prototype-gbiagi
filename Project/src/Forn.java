public class Forn extends Electrodomestic{
    private int temperatura;
    private boolean autoneteja;
    public Forn() {}
    public Forn(String nom, String color, int preu, String marca, int eficiencia, int temperatura, boolean autoneteja) {
        super(nom, color, preu, marca, eficiencia);
        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    @Override
    public Electrodomestic clone() {
        return new Forn();
    }
}
