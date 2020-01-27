package software.development.academy;

import java.util.Scanner;

public class Zadania {

    public static void main(String[] args) {
        zadanie4();
    }

    //zadeklaruj dwie zmienne: [source,java]
    //  int zmienna1 = 10;   int zmienna2 = 20;
    //następnie przy pomocy trzeciej zmiennej c, zamień ich wartości, tak aby zmienna2 miała wartość 10, natomiast zmienna1 wartość 20
    static void zadanie1() {
        int zmienna1 = 10;
        int zmienna2 = 20;

        int c;
        c = zmienna2;
        zmienna2 = zmienna1;
        zmienna1 = c;

        System.out.println(zmienna1 + " " + zmienna2);

        String str1 = "Jeden";
        String str2 = "Dwa";

        String strC = str2;
        str2 = str1;
        str1 = strC;

        System.out.println(str1 + " " + str2);

    }

    //Przypisz 18 (literał) do zmiennych typu: byte, short, int, long, double, float. Analogiczną operację wykonaj dla wartosci 35000 oraz 3_500_000_000
    //• Dla jakich typów uda się te operacje, dla jakich trzeba zastosować dodatkowe rzutowania? • jakie są rezultaty wydruku takich wartości
    static void zadanie2() {
        byte byte3 = (byte) 3_500_000_000L;
    }

    //Napisz program dodający dwie liczby podane przez użytkownika
    static void zadanie3() {

        Scanner naszSkaner = new Scanner(System.in);
        System.out.println("Wypisz liczbę x: ");
        int x = naszSkaner.nextInt();

        System.out.println("Wypisz liczbe y: ");
        int y = naszSkaner.nextInt();

        int suma = x + y;
        int roznica = x - y;
        int mnozenie = x * y;
        double dzielenie = (double) x / y;

        System.out.println("suma " + suma);
        System.out.println("roznica " + roznica);
        System.out.println("mnozenie " + mnozenie);
        System.out.println("dzielenie " + dzielenie);
    }

    //Napisz program, który rozwiązuje równanie kwadratowe. Podajemy współczynnika a, b i c.
    static void zadanie4() {
        //ax^2 + bx + c
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = ((b * b) - (4 * a * c));
        //delta = Math.pow(b,2) - 4 * a * c;
        if (delta > 0) {
//            double pierwDelta = Math.sqrt(delta);
//            double mianownik = (2 * a);
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println(" 2 rozwiazania: " + x1 + " " + x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("1 rozwiazanie: " + x);
        } else {
            System.out.println("brak rozwiazan");
        }

        ///----------------
        if (delta > 0)
            System.out.println("2 rozwiazania");
        else if (delta == 0)
            System.out.println("1 rozwiazanie");
        else System.out.println("bez rozwiazan");

        String wynik = (delta >= 0)
                ? (delta == 0 || delta == -0) ? "1 rozwiazania" : "2 rozwiazania"
                : "brak rozwiazan";
        System.out.println(wynik);
    }


}
