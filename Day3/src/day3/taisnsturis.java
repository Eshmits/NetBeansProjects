/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author Toms
 */
public class taisnsturis implements Nsturi {
    
    public int malasGarumsX;
    public int malasGarumsY;

    public taisnsturis(int malasGarumsX, int malasGarumsY) {
        this.malasGarumsX = malasGarumsX;
        this.malasGarumsY = malasGarumsY;
    }

    public int getMalasGarumsX() {
        return malasGarumsX;
    }

    public void setMalasGarumsX(int malasGarumsX) {
        this.malasGarumsX = malasGarumsX;
    }

    public int getMalasGarumsY() {
        return malasGarumsY;
    }

    public void setMalasGarumsY(int malasGarumsY) {
        this.malasGarumsY = malasGarumsY;
    }

    
    
    public double laukums (){
        return this.malasGarumsX * this.malasGarumsY;
    }
    
    public double perimetrs () {
        return (2 * this.malasGarumsX + 2 *this.malasGarumsY);
    }
    /*P=x+x+y+y 
        P=2x+2y
        P=2(x+y)*/
}
