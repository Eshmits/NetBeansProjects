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
public class Kvadrats implements GeometriskaFigura {
    
    public int malasGarums;
    public String Krasa;

    @Override
    public double laukums() {
        return this.malasGarums * this.malasGarums;
    }

    @Override
    public double perimetrs() {
        return this.malasGarums * 4;
    }

    @Override
    public String Krasa() {
        return this.Krasa;
    }
}
    

