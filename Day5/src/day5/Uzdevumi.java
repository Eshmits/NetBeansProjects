/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Toms
 */
public class Uzdevumi {
    private static Scanner ievade = new Scanner(System.in);
    
    public static void Piemeri(){
        System.out.print("Ievadi valsti: ");
        String valsts = ievade.next().toLowerCase();
        
        switch(valsts){
            case "latvija":
                System.out.println("Rīga");
                break;
                case "lietuva":
                System.out.println("Viļņa");
                break;                
            default:
                System.out.println("Nezināma valsts");
                break;
        }        
    }
    
    public static void MasiviSaraksti(){
        int[] skaitluMasivs = new int[3];
        skaitluMasivs[0] = 5;
        skaitluMasivs[1] = 9;
        skaitluMasivs[2] = 1;
        
        int [] skaitluMasivs2 = { 5, 9, 1 };
        int masivaIeraksti = skaitluMasivs2.length;        
        int tresaisSkaitlis = skaitluMasivs2[2];
        boolean irCetri = false;
        //iziet cauri visam masivam un izvada vertibas
        for(int skaitlis : skaitluMasivs2){
            System.out.println(skaitlis);
            if (skaitlis == 4){
                
                System.out.print("Skaitlis 4 ir masīvā");
                irCetri = true;
            }
        }
        //if(irCetri == false)
        //if(irCetri != true)
        //viens un tas pats
        if (!irCetri){
            System.out.print("Skaitlis 4 nav masīvā");
        }
        
        ArrayList<String> tekstaSaraksts = new ArrayList <String>();
        tekstaSaraksts.add("teksts1");
        tekstaSaraksts.add("teksts2");
        tekstaSaraksts.add("teksts3");
        int sarakstaIeraksti = tekstaSaraksts.size();
        String tresaisVards = tekstaSaraksts.get(2);
        //cikls iziet cauri visam sarakstam un izvada vertibas
        for(String vards : tekstaSaraksts){
            System.out.println(vards);
        }
    }
    
    public static void Uzdevums(){
        
        System.out.print("Ievadi 1. skaitli: ");
        int d1 = ievade.nextInt();
        System.out.print("Ievadi operāciju : ");
        char op = ievade.next().charAt(0);
        System.out.print("Ievadi 2. skaitli: ");
        int d2 = ievade.nextInt();
        System.out.print("Ievadi operāciju : ");
        char op2 = ievade.next().charAt(0);
        System.out.print("Ievadi 3. skaitli: ");
        int d3 = ievade.nextInt();    
        
        double rezultats;
        
         if (op == '*' || op == '/'){
             rezultats = aprekins(d1, d2, op);
             rezultats = aprekins(rezultats, d3, op2);             
         } else {
             rezultats = aprekins(d2, d3, op2);
             rezultats = aprekins(d1, rezultats, op);
         }
         System.out.print("Rezultāts : " + rezultats);
    }
    
    private static double aprekins(double d1, double d2, char op){
        switch (op) {
            case '*':
                return d1 * d2;
            case '/':
                return d1 / d2;             
            case '+':
                return d1 + d2;
            case '-':
                return d1 - d2; 
            default:
                return 0;
        }
    }   
    
}