/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

/**
 *
 * @author Pc
 */
public class AgentData {
    private String agentid;
    private String agentnamn;
    private String agentlosenord;
    
    public void infoAgentId(String agentid){
        this.agentid = agentid;
    }
    
    public String hamtaAgentId(){
        return agentid;
    }
    
    public void infoAgentNamn(String agentnamn){
        this.agentnamn = agentnamn;
    }
    
    public String hamtaAgentNamn(){
        return agentnamn;
    }
    
    public void infoAgentLosenord(String agentlosenord){
        this.agentlosenord = agentlosenord;
    }
    
    public String hamtaAgentLosenord(){
        return agentlosenord;
    }
    
}
