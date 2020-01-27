package software.development.academy;

import java.util.Scanner;

public class Zadania {

    public static void main(String[] args) {
        zadanie3();
    }

    //zadeklaruj dwie zmienne: [source,java]
    //  int zmienna1 = 10;   int zmienna2 = 20;
    //następnie przy pomocy trzeciej zmiennej c, zamień ich wartości, tak aby zmienna2 miała wartość 10, natomiast zmienna1 wartość 20
    static void zadanie1(){
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
    static void zadanie2(){
        byte byte3 = (byte)3_500_000_000L;
    }

    //Napisz program dodający dwie liczby podane przez użytkownika
    static void zadanie3(){

        Scanner naszSkaner = new Scanner(System.in);
        System.out.println("Wypisz liczbę x: ");
        int x = naszSkaner.nextInt();

        System.out.println("Wypisz liczbe y: ");
        int y = naszSkaner.nextInt();

        int suma = x + y;
        int roznica = x - y;
        int mnozenie = x * y;
        double dzielenie = (double)x / y;

        System.out.println("suma " + suma);
        System.out.println("roznica " + roznica);
        System.out.println("mnozenie " + mnozenie);
        System.out.println("dzielenie " + dzielenie);

    }
}
