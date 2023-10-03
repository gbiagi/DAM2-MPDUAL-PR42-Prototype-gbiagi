import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestic> listaRentadores = new ArrayList<>();
        List<Electrodomestic> listaRentadoresCopy = new ArrayList<>();

        List<Electrodomestic> listaNeveres = new ArrayList<>();
        List<Electrodomestic> listaNeveresCopy = new ArrayList<>();

        List<Electrodomestic> listaForns = new ArrayList<>();
        List<Electrodomestic> listaFornsCopy = new ArrayList<>();

        Rentadora rentadora1 = new Rentadora("Rent1","Rojo",250,"Samsung",50,2500,10);
        Rentadora rentadora2 = new Rentadora("Rent2","Azul",500,"Fujitsu",80,4000,5);
        listaRentadores.add(rentadora1);
        listaRentadores.add(rentadora2);

        Nevera nevera1 = new Nevera("Nev1","Verde",300,"Mitsubishi",90,100,10);
        Nevera nevera2 = new Nevera("Nev2","Negro",780,"Balay",80,250,15);
        listaNeveres.add(nevera1);
        listaNeveres.add(nevera2);

        Forn forn1 = new Forn("Forn1","Lila",150,"IBM",90,250,false);
        Forn forn2 = new Forn("Forn2","Plata",900,"Apple",100,300,true);
        listaForns.add(forn1);
        listaForns.add(forn2);

        // Clonar listas
        for (Electrodomestic elctr : listaRentadores) {
            listaRentadoresCopy.add(elctr);
        }
    }
}