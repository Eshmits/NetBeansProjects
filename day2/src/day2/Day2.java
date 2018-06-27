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
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kvadrats kvadrats = new Kvadrats();     
               
        kvadrats.malasGarums = 10;        
        kvadrats.Krasa = "Sarkans";
        
        Aplis aplis = new Aplis();
        
        aplis.radius = 7;        
        aplis.Krasa = "Zils";
        
        double laukums = kvadrats.laukums();
        double perimetrs = kvadrats.perimetrs();
        String krasa = kvadrats.Krasa();
        
        System.out.println("Kvadrāta laukums = " + laukums);
        System.out.println("Kvadrāta perimetrs = " + perimetrs);
        System.out.println("Kvadrāta Krāsa = " + krasa);
        //vai: Izvade(kv):
        
        System.out.println("Apļa laukums = " + aplis.laukums());
        System.out.println("Apļa perimetrs = " + aplis.perimetrs());
        System.out.println("Apļa Krāsa = " + aplis.Krasa());
        
        KravasAuto kr = new KravasAuto(10000, "ražotājs", "marka", 2010);
        System.out.println(kr.toString());
        
        PasazieruAuto pa = new PasazieruAuto (5, "Opel", "Insignia", 2010);
        System.out.println(pa.toString());
            
    }       
    
        static void Izvade (GeometriskaFigura figura) {
        System.out.println("Laukums = " + figura.laukums());
        System.out.println("Perimetrs = " + figura.perimetrs());
        System.out.println("Krāsa = " + figura.Krasa());
        
    }
    
    
    
}
