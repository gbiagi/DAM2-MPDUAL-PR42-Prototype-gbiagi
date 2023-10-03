public class Nevera extends Electrodomestic{
    private int frigories;
    private int soroll;

    public Nevera() {}
    public Nevera(String nom, String color, int preu, String marca, int eficiencia, int frigories, int soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.frigories = frigories;
        this.soroll = soroll;
    }
    @Override
    public Electrodomestic clone() {
        return new Nevera();
    }
}

