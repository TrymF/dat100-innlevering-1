package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv inn bruttoinntekt: ");
        int n = scanner.nextInt();
        
        if (0 > n) {
        	System.out.print("Skriv inn et positivt tall :)");
        }
        
        else if (0 < n && n <= 208050) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr får du ingen trinnskatt");
        }
        else if (208051 <= n && n <= 292850) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr. Blir trinnskatten din: " + n*0.017 + "kr");
        }
        else if (292851 <= n && n <= 670000) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr. Blir trinnskatten din: " + n*0.04 + "kr");
        }
        else if (670001 <= n && n <= 937900) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr. Blir trinnskatten din: " + n*0.136 + "kr");
        }
        else if (937901 <= n && n <= 1350000) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr. Blir trinnskatten din: " + n*0.166 + "kr");
        }
        else if (1350001 <= n) {
        	System.out.println("Ved bruttoinntekt: " + n + "kr. Blir trinnskatten din: " + n*0.176 + "kr");
        }
        scanner.close();
	}

}
