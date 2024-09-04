package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et heltall større enn 0: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int resultat = beregnFakultet(n);
            System.out.println("Verdien av " + n + "! er " + resultat);
        } else {
            System.out.println("Tallet må være større enn 0 >:(");
        }

        scanner.close();
    }

    public static int beregnFakultet(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * beregnFakultet(n - 1);
        }
    }
}