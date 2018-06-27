/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Toms
 */
public class PasazieruAuto extends Transportlidzeklis {
    int maxPasazieri;

    public PasazieruAuto(int maxPasazieri, String razotajs, String marka, int gads) {
        super(razotajs, marka, gads);
        
        this.maxPasazieri = maxPasazieri;
    }
    
    //@Override
    public String toString(){
        String teksts = super.toString();
        teksts += ", Max Pasazieri = " + this.maxPasazieri;        
        return teksts;
        
        //Vai
        
        /*return String.format("%s , maxPasazieri = %s" 
              ,super.toString()
              ,this.maxPasazieri);*/
    }
    
}
