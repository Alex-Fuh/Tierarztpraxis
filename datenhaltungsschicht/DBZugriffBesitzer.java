package datenhaltungsschicht;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import logikschicht.Besitzer;

public class DBZugriffBesitzer extends DBZugriff {

    private static ResultSet datenmenge;

    public static boolean insert(Besitzer besitzer) throws Exception {
        connect();
        String insertCommand = "INSERT INTO Besitzer (Nachname, Vorname, Straße, Hausnummer, PLZ, Stadt, Telefonnummer)"
                + ", '" + besitzer.getBesitzerNachname() + ", '" + besitzer.getBesitzerVorname() + ", '"
                + besitzer.getBesitzerStrasse() + ", '" + besitzer.getBesitzerhausnummer() + ", '" + besitzer.getPlz() + ", '"
                + besitzer.getStadt() + ", '" + besitzer.getTelefonnummer();

        try {
            befehl.executeUpdate(insertCommand);
        } catch (SQLExeption ex) {
            String errorMessage = "Fehler beim Himzufügen des Besitzers " + besitzer.getBesitzerID() + "aufgetreten.";
            Logger.logError(ex);
            throw new Exception(errorMessage);
        }
        Logger.logCommand(insertCommand);

        close();
        return true;
    }

    public static boolean update(Besitzer besitzer) throws Exception{
        connect();
        String updateCommand = "UPDATE Besitzer SET Vorname = '" + "Nachname = " + besitzer.getBesitzerNachname() + "Vorname = " + besitzer.getBesitzerVorname() + besitzer.getBesitzerStrasse()
        + besitzer.getBesitzerhausnummer() + besitzer.getPlz() + besitzer.getStadt() + besitzer.getTelefonnummer();
        try{
                befehl.executeUpdae(updateCommand); 
        }catch(SQLException ex){
            String errorMessage = "Es ist ein Fehler beim aktualisieren des Besitzers" + besitzer.getBesitzerID() + "aufgetreten";
            Logger.logError(ex);
        }
    }
    

    public static boolean delete(Besitzer besitzer) {
        connect();
        String deleteCommand = "DELETE FROM Besitzer WHERE BesitzerID = " + besitzer.getBesitzerID();

        try {
            befehl.executeUpdate(deleteCommand);
        } catch (SQLException ex) {
            String errorMessage = " Fehler beim Löschen des Besitzers  " + besitzer.getBesitzerID() + "aufgetreten.";
            Logger.logError(ex);
            throw new Exception(errorMessage);
        }
        Logger.logCommand(deleteCommand);

        close();
        return true;
    }

    public static List<Besitzer> getAllBesitzer() throws Exception {
        ArrayList<Besitzer> besitzer = new ArrayList<>();
        connect();
        datenmenge = befehl.executeQuery("SELECT * FROM Kunde");

        while(getNext()) {
            String nachname = getNachname("Nachname");
            String vorname = getVorname("Vorname");
            String straße = getStraße("Straße");
            String hausnummer = getHausnummer("Hausnummer");
            String plz = getPlz("PLZ");
            String stadt = getStadt("Stadt"); 
            String telefonnummer = getTelefonnummer("Telefonnummer"); 

            Besitzer besitzer = new Besitzer(nachname, vorname, straße, plz, stadt, telefonnummer);
            besitzer.add(besitzer);  
    
        }

        close();
        return besitzer;

    }

    public static Besitzer getBesitzerByBesitzerID(String besitzerID) throws Exception {
        connect();
        Besitzer besitzer = null;
        String query = "SELECT * FROM Besitzer WHERE BesitzerID = " + besitzerID;
        datenmenge = befehl.executeQuery(query);

        if (datenmenge.next()) {
             String nachname = getNachname();
             String vorname = getVorname();
             String straße = getStraße();
             String hausnummer = getHausnummer();
             String plz = getPlz();
             String stadt = getStadt();
             String telefonnummer = getTelefonnummer();     
        }

        besitzer = new Besitzer(nachname, vorname, straße, hausnummer, stadt, telefonnummer);
    }
    close();
    return besitzer;
}

public static boolean getNext() throws Exception {
    if(datenmenge.next()) {
        return true;
    } else {
        close();
        return false;
     }
    }

    public static int getBesitzerID() throws SQLException {
        return datenmenge.getInt("BesitzerID");
    }

    public static String getNachname() throws Exception{
        return datenmenge.getString("Nachname");
    }

    public static String getVorname() throws Exception{
        return datenmenge.getString("Vorname");
    }
    
    public static String getStraße() throws Exception{
        return datenmenge.getString("Straße");
    }

    public static int getHausnummer() throws Exception{
        return datenmenge.getString("Hausnummer");
    }

    public static int getPlz() throws Exception{
        return datenmenge.getString("PLZ");
    } 

    public static String getStadt() throws Exception{
        return datenmenge.getString("Stadt");
    } 

    public static int getTelefonnummer() throws Exception{
        return datenmenge.getString("Telefonnummer");
    } 
}
