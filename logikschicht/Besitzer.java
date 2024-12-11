package logikschicht;

public class Besitzer {
    private String besitzerID;
    private String besitzerNachname;
    private String besitzerVorname;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String stadt;
    private String telefonnummer;

    public Besitzer() {
    }

    public Besitzer(String besitzerID, String besitzerNachname, String besitzerVorname, String hausnummer,
            String plz, String stadt, String telefonnummer, String strasse) {
        this.besitzerID = besitzerID;
        this.besitzerNachname = besitzerNachname;
        this.besitzerVorname = besitzerVorname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        this.telefonnummer = telefonnummer;
    }

    public String getBesitzerID() {
        return besitzerID;
    }

    public String getHausnummer(){
        return hausnummer;
    }

    public String getBesitzerNachname() {
        return besitzerNachname;
    }

    public String getBesitzerVorname() {
        return besitzerVorname;
    }

    public String getBesitzerStrasse() {
        return strasse;
    }

    public String getBesitzerhausnummer(){
        return hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public String getStadt() {
        return stadt;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setBesitzerID(String besitzerID) {
        this.besitzerID = besitzerID;
    }

    public void setBesitzerNachname(String besitzerNachname) {
        this.besitzerNachname = besitzerNachname;
    }

    public void setBesitzerVorname(String besitzerVorname) {
        this.besitzerVorname = besitzerVorname;
    }

    public void sethausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setstrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Besitzer-ID: " + besitzerID +
                "\nBesitzer-Nachname: " + besitzerNachname +
                "\nBesitzer-Vorname: " + besitzerVorname +
                "\n hausnummer: " + hausnummer +
                "\n strasse: " + strasse +
                "\nPLZ: " + plz +
                "\nStadt: " + stadt +
                "\nTelefonnummer: " + telefonnummer + "\n";
    }
}
