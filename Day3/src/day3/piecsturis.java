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
public class piecsturis implements Nsturi {
    public int malasGarums;

    public piecsturis(int malasGarums) {
        this.malasGarums = malasGarums;
    }

    public int getMalasGarums() {
        return malasGarums;
    }

    public void setMalasGarums(int malasGarums) {
        this.malasGarums = malasGarums;
    }
    
    public double perimetrs (){
        return this.malasGarums * 5;
    }
    
    public double laukums () {
        return 1/4 * Math.sqrt(5 * (5+2 * Math.sqrt(5)) * this.malasGarums * this.malasGarums);
    }
}
