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
public class trijsturis implements Nsturi {
    
    public int malasGarumsX;
    public int malasGarumsY;
    public int malasGarumsZ;

    public trijsturis(int malasGarumsX, int malasGarumsY, int malasGarumsZ) {
        this.malasGarumsX = malasGarumsX;
        this.malasGarumsY = malasGarumsY;
        this.malasGarumsZ = malasGarumsZ;
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

    public int getMalasGarumsZ() {
        return malasGarumsZ;
    }

    public void setMalasGarumsZ(int malasGarumsZ) {
        this.malasGarumsZ = malasGarumsZ;
    }
    
    public double perimetrs (){
        return this.malasGarumsX + this.malasGarumsY + this.malasGarumsZ;
    }
    
    public double pp (){
        return (this.malasGarumsX + this.malasGarumsY + this.malasGarumsZ) / 2;
    }
    
    public double laukums () {
        return Math.sqrt(pp() * (pp() - this.malasGarumsX) * (pp() - this.malasGarumsY) * (pp() - this.malasGarumsZ));
    }
}
//area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));