package präsentationsschicht

import java.io.PrintStream;
import java.util.Scanner;

public class KonsolenMenü {
    public static void startMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.setProperty("file.encoding", "UTF-8");

            while (true) {
                System.out.println("Kunden-Datenbank-Operatioen");
               System.out.println("1. Neuen Patienten hinzufügen");
                System.out.println("2. Patienten aktualisieren");
                System.out.println("3. Patienten löschen");
                out.println("4. Alle Patienten auflisten");
                out.println("5. Patienten anhand der Tier-ID ausgeben");
                out.println("6. Beenden");

                out.println("Geben Sie Ihre gewünschte Auswahl ein");
                int choice = scanner.nextInt();
                scanner.nextLine();
                String tierid;
                String tiername;
                String art;
                String rasse;
                String geburtsdatum;
                String besitzerid;
                switch (choice) {
                    case 1:
                        System.out.print("Geben Sie den Tiernamen ein: ");
                        tiername = scanner.nextLine();
                        System.out.print("Geben Sie die Art des Tieres an: ");
                        art = scanner.nextLine();
                        out.print("Geben Sie die Rasse des Tieres an: ");
                        rasse = scanner.nextLine();
                        out.print("Geben Sie das Geburtsdatum des tieres ein (TT.MM.JJJJ): ");
                        geburtsdatum = scanner.nextLine();
                        out.print("Geben Sie die BesitzerID des Besitzers des Tieres ein: ");
                        besitzerid = scanner.nextLine();
                }

  

            }
        }
    }
}