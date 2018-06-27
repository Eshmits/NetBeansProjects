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
public class Aplis implements GeometriskaFigura{
    
    public double radius;
    
    public String Krasa;

    @Override
    public double laukums() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimetrs() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String Krasa() {
        return this.Krasa;
    }    
}
