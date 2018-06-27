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
public class Skolens {
    private String vards;
    
    private String uzvards;
    
    private String epasts;
    
    private int dzGads;
    
    private Klase klase;

    public Skolens(String vards, String uzvards, String epasts, int dzGads, Klase klase) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.epasts = epasts;
        this.dzGads = dzGads;
        this.klase = klase;
    }
    
    public String getVards() {
        return vards;
    }

    public String getUzvards() {
        return uzvards;
    }
}
