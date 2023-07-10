import java.util.Scanner;

public class Handyrechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Grundgebühr = 5.99; // Grundgebühr
        double proSMS = 0.19; //SMS KOSTEN
        double proMMS = 0.29; // MMS Kosten
        double proMBDaten = 0.99; // DATEN KOSTEN PRO MB

        System.out.println("Wieviele SMS haben Sie verschickt?");
        int SMS = scanner.nextInt();//Eingabe Anzahl SMS
        System.out.println("Wieviele MMS haben Sie verschickt?");
        int MMS = scanner.nextInt();//Eingabe Anzahl MMS
        System.out.println("Wieviele Daten haben Sie verbraucht?");
        int Daten = scanner.nextInt();//Eingabe Anzahl verbrauchter Daten in MB


        double KostenSMS = proSMS * SMS; // ERRECHNUNG GESAMTKOSTEN SMS
        double KostenMMS = proMMS * MMS; // ERRECHNUNG GESAMTKOSTEN MMS
        double KostenDaten = proMBDaten * Daten; //Errechnung GESAMTKOSTEN Daten
        double Gesamtkosten = Grundgebühr + KostenSMS + KostenMMS +
                KostenDaten; //Errechnung Gesamtkosten
        System.out.println("Ihre Handyrechnung beträgt");
        System.out.println("Grundgebühr" + "" + "Grundgebühr" + " €" + "+");
        System.out.println("Anzahl SMS" + " " + SMS + " x " + proSMS + " €" + "Gebühr pro SMS = " + KostenSMS);
        System.out.println("Anzahl SMS" + " " + MMS + " x " + proMMS + " €" + "Gebühr pro MMS = " + KostenMMS);
        System.out.println("Anzahl verbrauchter Daten" + " " + Daten + " x " + proMBDaten + " €" + "Gebühr pro MB Daten = " + KostenDaten);
        System.out.println("_________________________________________________________________");
        System.out.println("Die Gesamtkosten betragen = " + Gesamtkosten + " €");
        if (Gesamtkosten < 50) {
            System.out.println("Sie Haben 50 Treuepunkte bekommen");
        } else if (Gesamtkosten < 500) {
            System.out.println("Sie haben 500 Treuepunkte bekommen");
        } else if (Gesamtkosten < 1000) {
            System.out.println("Sie haben 1000 Treuepunkte bekommen");
        } else {
            System.out.println("Sie haben 1500 Treuepunkte bekommen");
        }
    }
}
