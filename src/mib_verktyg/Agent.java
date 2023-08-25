/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_verktyg;

public class Agent {

    private int Agent_ID, Omrade;
    private String Namn, Telefon, Anstallningsdatum, Administrator, Losenord;

    public Agent(int Agent_ID, int Omrade, String Namn, String Telefon, String Anstallningsdatum, String Administrator, String Losenord) {
        this.Agent_ID = Agent_ID;
        this.Omrade = Omrade;
        this.Namn = Namn;
        this.Telefon = Telefon;
        this.Anstallningsdatum = Anstallningsdatum;
        this.Administrator = Administrator;
        this.Losenord = Losenord;
    }

    public int getagentid() {
        return Agent_ID;
    }

    public int getomrade() {
        return Omrade;
    }

    public String getnamn() {
        return Namn;
    }

    public String gettelefon() {
        return Telefon;
    }

    public String getanstallningsdatum() {
        return Anstallningsdatum;
    }

    public String getadministrator() {
        return Administrator;
    }

    public String getlosenord() {
        return Losenord;
    }
}
