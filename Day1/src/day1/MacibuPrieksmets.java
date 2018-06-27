/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author kristaps
 */
public class MacibuPrieksmets {
    private String nosukums;
    
    private Telpa telpa;
    
    private Skolotajs pasniedzejs;

    public MacibuPrieksmets(String nosukums, Telpa telpa, Skolotajs pasniedzejs) {
        this.nosukums = nosukums;
        this.telpa = telpa;
        this.pasniedzejs = pasniedzejs;
    }

    public String getNosukums() {
        return nosukums;
    }
    
    public String getPasniedzejs(){
        return pasniedzejs.toString();
    }

    @Override
    public String toString() {
        return "MacibuPrieksmets{" + "nosukums=" + nosukums + '}';
    }
    
    
}
