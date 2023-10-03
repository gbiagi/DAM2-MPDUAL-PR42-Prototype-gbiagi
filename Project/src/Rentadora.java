public class Rentadora extends Electrodomestic{
    private int revolucions;
    private int soroll;

    public Rentadora() {}
    public Rentadora(String nom, String color, int preu, String marca, int eficiencia, int revolucions, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.revolucions = revolucions;
        this.soroll = soroll;
    }

    @Override
    public Electrodomestic clone() {
        return new Rentadora();
    }
}
