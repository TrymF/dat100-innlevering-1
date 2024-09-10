package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        int inntekt = scanner.nextInt();

        double trinnskatt = 0.0;

        if (inntekt < 0) {
            System.out.print("Skriv inn et positivt tall :)");
        } 
        else {
            // Trinn 5
            if (inntekt > 1350000) {
                trinnskatt += (inntekt - 1350000) * 0.176;
                inntekt = 1350000;
            }
            // Trinn 4
            if (inntekt > 937900) {
                trinnskatt += (inntekt - 937900) * 0.166;
                inntekt = 937900;
            }
            // Trinn 3
            if (inntekt > 670000) {
                trinnskatt += (inntekt - 670000) * 0.136;
                inntekt = 670000;
            }
            // Trinn 2
            if (inntekt > 292850) {
                trinnskatt += (inntekt - 292850) * 0.04;
                inntekt = 292850;
            }
            // Trinn 1
            if (inntekt > 208050) {
                trinnskatt += (inntekt - 208050) * 0.017;
            }

            System.out.println("Din totale trinnskatt er: " + trinnskatt + " kr");
        }
        
        scanner.close();
    }
}