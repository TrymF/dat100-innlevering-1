package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lar bruker selv sette hvor mange studenter som skal få karakter
        System.out.print("Oppgi antall studenter du skal sette karakter til: ");
        int antallStudenter = scanner.nextInt();

        for (int i = 1; i <= antallStudenter; i++) {
            int n;

            do {
                System.out.print("Oppgi poengsum til student nmr " + i + ": ");
                n = scanner.nextInt();
                
                if (n < 0 || n > 100) {
                    System.out.println("Ugyldig, karakter skalaen går mellom 0-100. Prøv igjen.");
                }
            } while (n < 0 || n > 100); 
            
            if (n <= 39) {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren F");
            } else if (n <= 49) {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren E");
            } else if (n <= 59) {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren D");
            } else if (n <= 79) {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren C");
            } else if (n <= 89) {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren B");
            } else {
                System.out.println("Ved poengsum: " + n + ", får student nmr " + i + " karakteren A");
            }
        }
        
        scanner.close();
    }
}