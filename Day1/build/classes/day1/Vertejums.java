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
public class Vertejums {
    private MacibuPrieksmets prieksmets;
    
    private Skolens skolens;
    
    private int atzime;
    
    public Vertejums(MacibuPrieksmets prieksmets, Skolens skolens, int atzime) {
        this.prieksmets = prieksmets;
        this.skolens = skolens;
        this.atzime = atzime;
    }
    
    public String Informacija()
    {
        // skolēna vārds, uzvārds, priekšmeta nosaukums, 
        //pasniedzējs un saņemtā atzīme
        /*return "Skolēns = " 
                + this.skolens.getVards() 
                + " "
                + this.skolens.getUzvards()
                + ", Priekšmets = "
                + this.prieksmets.getNosukums()
                + ", Pasniedzējs = "
                + this.prieksmets.getPasniedzejs()
                + ", Atzīme = " 
                + this.atzime;*/
        
        return String.format("Skolēns = %s %s, Priekšmets = %s, Pasniedzējs = %s, Atzīme = %s", 
                this.skolens.getVards(),
                this.skolens.getUzvards(),
                this.prieksmets.getNosukums(),
                this.prieksmets.getPasniedzejs(),
                this.atzime);

    }
}
