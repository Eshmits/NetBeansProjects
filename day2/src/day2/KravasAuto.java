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
public class KravasAuto extends Transportlidzeklis {
    
    double ietilpiba;

    public KravasAuto(double ietilpiba, String razotajs, String marka, int gads) {
        super(razotajs, marka, gads);
        /*this.razotajs = razotajs;
        this.marka = marka;
        this.gads = gads; super izpilda šīs 3 rindas*/
        
        this.ietilpiba = ietilpiba;
    }
    
    @Override
    public String toString(){
        String teksts = super.toString();
        teksts += ", ietilpība = " + this.ietilpiba;        
        return teksts;
        
        // Vai
        
        //return String.format("%s, ietilpība = %s"
        //, super.toString()
        //, this.ietilpiba);
    }
    
}
