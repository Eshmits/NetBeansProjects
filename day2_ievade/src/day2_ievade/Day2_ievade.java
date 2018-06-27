/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;

import java.util.Scanner;

/**
 *
 * @author Toms
 */
public class Day2_ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Scanner ievade = new Scanner(System.in);
        
        System.out.print("Ievadi skaitli:");
        
        int skaitlis = ievade.nextInt();
        
        System.out.println("Tu ievadīji skaitli " + skaitlis);*/
        //vardaIevade();
        //gradi();
        uzdevums3();
        
    
}
    static void vardaIevade(){
        Scanner ievade = new Scanner(System.in);
        
        System.out.print("Ievadi vārdu:");
        String var = ievade.next();
        
        System.out.print("Ievadi uzvārdu: ");
        String uzv = ievade.next();
        
        System.out.printf("Mani sauc %s %s", var, uzv);
    }
    
    static void gradi(){
        Scanner ievade = new Scanner(System.in);
        
        System.out.print("Ievadi grādus: ");
        int gradi = ievade.nextInt();
        
        System.out.print("Ievadi mērvienību: ");
        char merv = ievade.next().charAt(0);
        
        merv = Character.toUpperCase(merv);
        
        
        if(merv == 'C'){       
                double rezultatsF = (gradi * 1.8) + 32;
                System.out.println(rezultatsF +  " F ");
            }
        else if(merv == 'F'){             
                System.out.println((gradi - 32) / 1.8 + " C ");
                }
        else{
                System.out.println(" Nezināma mērvienība ");
            }        
        
    }
    
    static void uzdevums3(){
        Scanner ievade = new Scanner(System.in);
        
        System.out.print("Ievadi attālumu: ");
        int att = ievade.nextInt();
        
        System.out.print("Ievadi laiku: ");
        int laiks = ievade.nextInt();
        
        System.out.print("Degvielas patēriņš: ");
        int deg = ievade.nextInt();
        
        //laiks h
        double stundas = (double)laiks / 60;
        //laiks s
        int sekundes = laiks * 60;
        //ātrums(km/min)
        double kmMin = att / (double)laiks;
        //ātrums (km/h)
        double kmH = att / stundas;
        //vidējais degvielas patēriņš(km/l)
        double kmL = att / deg;
        //vidējais degvielas patēriņš (l/ 100km)
        double l100Km = 100 / kmL;
        
        System.out.println("stundas = " + stundas);
        System.out.println("sekundes = " + sekundes);
        System.out.println("km/min = " + kmMin);
        System.out.println("km/h = " + kmH);
        System.out.println("km/l = " + kmL);
        System.out.println("l/100km = " + l100Km);
           
        
    }
    
    
}
