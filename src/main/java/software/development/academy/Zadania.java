package software.development.academy;

import java.util.Scanner;

public class Zadania {

    public static void main(String[] args) {
        zadanie9();
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

        String wynik = (delta > 0)
                ? "2 rozwiazania"
                : (delta == 0)
                ? "1 rozwiaznie"
                : "brak rozwiazan";
        System.out.println(wynik);
    }

    //Zadeklaruj 3 zmienne typu zmiennoprzecinkowego.
    // Następnie sprawdź ile z nich jest większych od zera.
    // Wypisz odpowiedni komunikat.
    static void zadanie5() {
        double x = 4.24;
        double y = -4.30;
        double z = 3.14;

        int licznikWiekszychOdZera = 0;
        if (x > 0) {
            licznikWiekszychOdZera += 1;
        }
        if (y > 0) {
            licznikWiekszychOdZera += 1;
        }
        if (z > 0) {
            licznikWiekszychOdZera += 1;
        }

        System.out.println("wiekszych od zera: " + licznikWiekszychOdZera);
    }

    //Zadeklaruj 3 zmienne typu zmiennoprzecinkowego.
    // Następnie sprawdź ile z nich jest większych od zera.
    // Wypisz odpowiedni komunikat.
    static void zadanie5v2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ile liczb bedziemy sprawdzac ? ");
        int ileLiczb = scanner.nextInt();
        int licznikWiekszychOdZera = 0;

        for (int i = 0; i < ileLiczb; i++) { // blok pomiedzy { } wykonuje sie tyle razy ile wyliczono obrotow petli
            System.out.print("podaj kolejną liczbę: ");
            double x = scanner.nextDouble();
            if (x > 0) {
                licznikWiekszychOdZera += 1;
            }
        }

        System.out.println("wiekszych liczb od zera: " + licznikWiekszychOdZera);

    }

    static void zadanie5v3() {
        int ileLiczb = 3;
        int licznikWiekszychOdZera = 0;
        double xx = 4.24;
        double y = -4.30;
        double z = 3.14;

        {
            System.out.print("podaj kolejną liczbę: ");
            double x = xx;
            if (x > 0) {
                licznikWiekszychOdZera += 1;
            }
        }

        {
            System.out.print("podaj kolejną liczbę: ");
            double x = y;
            if (x > 0) {
                licznikWiekszychOdZera += 1;
            }
        }

        {
            System.out.print("podaj kolejną liczbę: ");

            double x = z;
            if (x > 0) {
                licznikWiekszychOdZera += 1;
            }
        }
    }

    //Oswój się z operacjami matematycznymi, przetestuj każdą z nich w następujący sposób:
    //• zadeklaruj zmienne a i b, następnie przypisz wynik kolejnych operacji do zmiennych c,d,e,f • Oblicz średnią z tych liczb
    static void zadanie6() {
        double a = 50;
        double b = 34.12;
        double c = a * b;
        double d = a / b;
        double e = c + d / b;
        double f = a * a;

        double srednia = (a + b + c + d + e + f) / 6;

    }

    static void zadanie6v2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ile liczb bedziemy sprawdzac ? ");
        int ileLiczb = scanner.nextInt();
        double suma = 0;

        for (int i = 0; i < ileLiczb; i++) { // blok pomiedzy { } wykonuje sie tyle razy ile wyliczono obrotow petli
            System.out.print("podaj kolejną liczbę: ");
            double x = scanner.nextDouble();
            suma += x; //suma = suma + x;
        }

        double srednia = suma / ileLiczb;

        System.out.println("srednia: " + srednia);
    }

    static void zadanie7(){
        double r = 10.0;
        double pole = Math.PI * Math.pow(r,2);
        double pole2 = Math.PI * Math.pow(r,2);
        double pole3 = Math.PI * Math.pow(r,2);
        double pole4 = Math.PI * Math.pow(r,2);
        double obwod = 2 * Math.PI * r;
    }

    static void zadanie7v2(){
        double promien5 = 5.0;
        double pole1 = poleKola(2.0 + 4.0 + 8.0 / 30 * 5);
        double pole2 = poleKola(promien5);
        double pole3 = poleKola(promien10() + 2.0 + promien10());

    }

    static double promien10(){
        return 10.0;
    }

    static double pobierzLiczbeZeScannera(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        return scanner.nextDouble();
    }

    static double poleKola(double promien){
        double pole = Math.PI * Math.pow(promien,2);
        return pole;
        //return Math.PI * Math.pow(r,2);
    }

    //jak sprawdzić czy zadana liczba jest parzysta ?
    static void zadanie8(){
        int liczba = 13;
        int wynik = liczba % 2;
        boolean parzysta = (liczba % 2 == 0);
        boolean nieParzysta = (liczba % 2 == 1);

        boolean jestParzysta = parzysta(liczba);
        boolean jestNieparzysta = !parzysta(liczba);

        boolean jestParzystav3 = liczba%2 == 0 ? true : false;
        if(liczba % 2 == 0){
            System.out.println("jest parzysta");
        } else {
            System.out.println("jest nieparzysta");
        }
    }

    static boolean parzysta(int liczbaDoSprawdzenia){
        return liczbaDoSprawdzenia % 2 == 0;
    }

    //jaką wartość przyjmą zmienne x,y,z ?
    //int x = 5; int y = ++x + x++; int z = ++y;
    static void zadanie9(){
        int x = 5;
        int y = ++x + x++; //najpierw zwiekszamy ++x z 5 do 6, wiec wyrazenie ma wartosc 6 + 6 = 12,
        // po obliczeniu wartosc x zwiekszala sie do 7
        int z = ++y; //wartosc y zwiekszona do 13, z = 13

        System.out.println(x + " " + y + " " + z);

    }



}
