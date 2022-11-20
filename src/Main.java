import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Prostokat p1 = new Prostokat(3,4);
//
//
//        System.out.println("Dlugosc: " + p1.getDlugosc());
//        System.out.println("Obwod: " + p1.getObwod());
//        System.out.println("Obwod: " +p1.getSzerokosc());
//        System.out.println("Przekatna: " +p1.getPrzekatna());
//
//        Budynek b1 = new Budynek("wsiz", 2, LocalDate.of(1988,1,1));
//        Budynek b2 = new Budynek("kielnarowa", 4, LocalDate.of(1928,1,1));
//
//        b1.info();
//        b2.info();

//        Punkt pk1 = new Punkt(2.3,3.5);
//        pk1.opis();
//        pk1.przesun(1.2,-2);
//        pk1.opis();

        Prostokat_b p1 = new Prostokat_b(2,4);
        Trojkat t1 = new Trojkat(5, 2.5);
        Figura f1 = new Figura();
        Okrag o1 = new Okrag(new Punkt(3,4),4.6);

        System.out.println("Pole prostokata:" + p1.getPowierzchnia());
        System.out.println(f1.opis());
        o1.wSrodku(new Punkt(5,7));

    }
}