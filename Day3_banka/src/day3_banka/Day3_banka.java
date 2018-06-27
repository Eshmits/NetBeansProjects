/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_banka;

import java.util.Scanner;

/**
 *
 * @author Toms
 */
public class Day3_banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {              
    // klase klients
    //prasit darbibas switch/ if 
    //izveidot jaunu objektu Konts ar kuru veikt visas darbības
    //Ar kontu veicamās darbības:
    //getCustomer() : Customer
    //getCustomerName() : String
    //getBalance() : String
    //deposit(amount : double) : void
    //withdraw(amount : double) : void    
    Scanner ievade = new Scanner(System.in);  
    
    //Konta objekts
    
    Konts konts = new Konts(); 
    
    
    System.out.println("Ievadi vārdu: ");
    String vards = ievade.nextLine();
    System.out.println("Ievadi uzvārdu : ");
    String uzvards = ievade.next();
    System.out.println("Ievadi dzimumu: ");
    char dzimums = ievade.next().charAt(0);
    
    while(true)
            {
                //System.out.println("1. Iemaksa" + "\n" + "2. Izmaksa");
                System.out.print("Ievadi darbību: ");
                String darbiba = ievade.next();
                
                switch(darbiba)
                {
                    case "iemaksa":
                        System.out.print("Ievadi summu: ");
                        double iemaksa = ievade.nextDouble();
                        konts.deposit(iemaksa);                        
                        break;
                    case "izmaksa":
                        System.out.print("Ievadi summu: ");
                        double izmaksa = ievade.nextDouble();
                        konts.withdraw(izmaksa);
                        break;                    
                    default:
                        
                        return;
                }
    
            }
            
    }
}
