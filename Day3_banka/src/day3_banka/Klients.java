/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_banka;


/**
 *
 * @author Toms
 */
public class Klients {
    String vards;
    
    String uzvards;
    
    char dzimums;  
    

    public Klients(String vards, String uzvards, char dzimums) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.dzimums = dzimums;
    }

    public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public String getUzvards() {
        return uzvards;
    }

    public void setUzvards(String uzvards) {
        this.uzvards = uzvards;
    }

    public char getDzimums() {
        return dzimums;
    }

    public void setDzimums(char dzimums) {
        this.dzimums = dzimums;
    }
    
    
}
