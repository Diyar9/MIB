/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_verktyg;

public class Alien {

    private int Alien_ID, Plats, Ansvarig_Agent;
    private String Registreringsdatum, Losenord, Namn, Telefon;

    public Alien(int Alien_ID, int Plats, int Ansvarig_Agent, String Registreringsdatum, String Losenord, String Namn, String Telefon) {
        this.Alien_ID = Alien_ID;
        this.Plats = Plats;
        this.Ansvarig_Agent = Ansvarig_Agent;
        this.Registreringsdatum = Registreringsdatum;
        this.Losenord = Losenord;
        this.Namn = Namn;
        this.Telefon = Telefon;
    }

    public int getalienid() {
        return Alien_ID;
    }

    public int getplats() {
        return Plats;
    }

    public int getansvarigagent() {
        return Ansvarig_Agent;
    }

    public String getregistreringsdatum() {
        return Registreringsdatum;
    }

    public String getlosenord() {
        return Losenord;
    }

    public String getnamn() {
        return Namn;
    }

    public String gettelefon() {
        return Telefon;
    }
}
