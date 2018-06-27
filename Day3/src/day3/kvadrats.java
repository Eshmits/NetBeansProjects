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
public class kvadrats implements Nsturi {
    
    public int malasGarums;

    public kvadrats(int malasGarums) {
        this.malasGarums = malasGarums;
    }

    public int getMalasGarums() {
        return malasGarums;
    }

    public void setMalasGarums(int malasGarums) {
        this.malasGarums = malasGarums;
    }
    
    public double laukums(){
        return this.malasGarums * this.malasGarums;
}
    
    public double perimetrs() {
        return this.malasGarums * 4;
    }
}
