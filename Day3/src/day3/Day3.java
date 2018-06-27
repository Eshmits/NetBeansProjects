/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author Toms
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kvadrats s1 = new kvadrats(5);
        s1.perimetrs();
        s1.laukums();
        
        taisnsturis r1 = new taisnsturis(5, 2);
        r1.perimetrs();
        r1.laukums();
        
        trijsturis t1 = new trijsturis (5, 3, 4);
        t1.perimetrs();
        t1.laukums();
        
        piecsturis p1 = new piecsturis (5);
        p1.perimetrs();
        p1.laukums();
    }
    
    
    static void CalculateAreAndPerimeter (Nsturi sturi){
        
        Scanner ievade = new Scanner(System.in);
        
        System.out.println("Laukums : " + sturi.laukums());
        System.out.println("Perimetrs : " + sturi.perimetrs());       
                
    }
    
}
