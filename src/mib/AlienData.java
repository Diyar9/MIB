/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;


public class AlienData {
    private String alienid;
    private String alienlosenord;
    private String aliennamn;
    private String alienplats;
    
    public void infoAlienId(String alienid){
        this.alienid = alienid;
    }
    
    public String hamtaAlienId(){
        return alienid;
    }
    
    public void infoAlienLosenord(String alienlosenord){
        this.alienlosenord = alienlosenord;
    }
    
    public String hamtaAlienLosenord(){
        return alienlosenord;
    }
    
    public void infoAlienNamn(String aliennamn){
        this.aliennamn = aliennamn;
    }
    
    public String hamtaAlienNamn(){
        return aliennamn;
    }
    
    public void infoAlienPlats(String alienplats){
        this.alienplats = alienplats;
    }
    
    public String hamtaAlienPlats(){
        return alienplats;
    }
    
}


