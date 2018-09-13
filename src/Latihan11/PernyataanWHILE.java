package Latihan11;

import java.util.Scanner;

public class PernyataanWHILE {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a = 0, total = 0, bil;
        while (a != 7) {
            a++;
            System.out.print("Masukkan bilangan ke-" + a + " : ");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.print("Total jumlah " + a + " bilangan : ");
        System.out.println(total);
    }
}
