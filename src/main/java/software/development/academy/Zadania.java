package software.development.academy;

public class Zadania {

    public static void main(String[] args) {
        zadanie1();
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
}
