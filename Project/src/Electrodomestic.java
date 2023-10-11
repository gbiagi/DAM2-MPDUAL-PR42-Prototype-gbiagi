import java.util.Objects;

public abstract class Electrodomestic {
    public String nom;
    public String color;
    public int preu;
    public String marca;
    public int eficiencia;

    public Electrodomestic() {}
    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.preu = target.preu;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
        }
    }
    public abstract Electrodomestic clone();

    @Override
    public boolean equals (Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return (Objects.equals(cast2.nom, nom) &&
                Objects.equals(cast2.color, color) &&
                cast2.preu == preu &&
                Objects.equals(cast2.marca, marca) &&
                cast2.eficiencia == eficiencia);
    }
}
