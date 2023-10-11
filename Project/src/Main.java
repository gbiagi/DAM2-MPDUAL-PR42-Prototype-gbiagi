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

        Rentadora rentadora1 = new Rentadora();
        rentadora1.nom = "Rent1";
        rentadora1.color = "Rojo";
        rentadora1.preu = 250;
        rentadora1.marca = "Samsung";
        rentadora1.eficiencia = 50;
        rentadora1.revolucions = 2500;
        rentadora1.soroll = 10;

        Rentadora rentadora2 = new Rentadora();
        rentadora2.nom = "Rent2";
        rentadora2.color = "Azul";
        rentadora2.preu = 500;
        rentadora2.marca = "Fujitsu";
        rentadora2.eficiencia = 80;
        rentadora2.revolucions = 4000;
        rentadora2.soroll = 5;

        listaRentadores.add(rentadora1);
        listaRentadores.add(rentadora2);

        Nevera nevera1 = new Nevera();
        nevera1.nom = "Nev1";
        nevera1.color = "Verde";
        nevera1.preu = 300;
        nevera1.marca = "Mitsubishi";
        nevera1.eficiencia = 90;
        nevera1.frigories = 100;
        nevera1.soroll = 10;

        Nevera nevera2 = new Nevera();
        nevera2.nom = "Nev2";
        nevera2.color = "Negro";
        nevera2.preu = 780;
        nevera2.marca = "Balay";
        nevera2.eficiencia = 80;
        nevera2.frigories = 250;
        nevera2.soroll = 15;

        listaNeveres.add(nevera1);
        listaNeveres.add(nevera2);

        Forn forn1 = new Forn();
        forn1.nom = "Forn1";
        forn1.color = "Lila";
        forn1.preu = 150;
        forn1.marca = "IBM";
        forn1.eficiencia = 90;
        forn1.temperatura = 250;
        forn1.autoneteja = false;

        Forn forn2 = new Forn();
        forn2.nom = "Forn2";
        forn2.color = "Plata";
        forn2.preu = 900;
        forn2.marca = "Apple";
        forn2.eficiencia = 100;
        forn2.temperatura = 300;
        forn2.autoneteja = true;

        listaForns.add(forn1);
        listaForns.add(forn2);

        // Clonar listas
        for (Electrodomestic rentadora : listaRentadores) {
            listaRentadoresCopy.add(rentadora.clone());
        }
        for (Electrodomestic nevera : listaNeveres) {
            listaNeveresCopy.add(nevera.clone());
        }
        for (Electrodomestic forn : listaForns) {
            listaFornsCopy.add(forn.clone());
        }
        // Comparar llistes
        System.out.println("Comparar la mateixa llista: ");
        System.out.println("Rentadores: ");
        for (int i = 0; i < listaRentadores.size(); i++){
            compare(i, listaRentadores.get(i), listaRentadores.get(i));
        }
        System.out.println("Neveres: ");
        for (int i = 0; i < listaNeveres.size(); i++){
            compare(i, listaNeveres.get(i), listaNeveres.get(i));
        }
        System.out.println("Forns: ");
        for (int i = 0; i < listaForns.size(); i++){
            compare(i, listaForns.get(i), listaForns.get(i));
        }
        System.out.println("\nComparar la llista original amb la clonada:");
        System.out.println("Rentadores: ");
        for (int i = 0; i < listaRentadores.size(); i++){
            compare(i, listaRentadores.get(i), listaRentadoresCopy.get(i));
        }
        System.out.println("Neveres: ");
        for (int i = 0; i < listaNeveres.size(); i++){
            compare(i, listaNeveres.get(i), listaNeveresCopy.get(i));
        }
        System.out.println("Forns: ");
        for (int i = 0; i < listaForns.size(); i++){
            compare(i, listaForns.get(i), listaFornsCopy.get(i));
        }
    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics son el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics son objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics tenen les mateixes dades.");
            } else {
                System.out.println(i + ": Els electrodomestics NO tenen les mateixes dades.");
            }
        }
    }
}