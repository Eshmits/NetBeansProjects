/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Toms
 */
public class Uzdevumi {
    
    public String teksts = "";
    
    Scanner ievade = new Scanner(System.in);
    
    public static void Piemeri(){
        //nevar izmantot mainīgo "teksts", jo "static"
        //teksts = "A";
        
        // cikls no 1 lidz 10
        for (int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
        }
        
        //Cikls no 5 lidz 1
        int N = 5;
        while (true){
            if(N == 0){
                break;
            }
            
            System.out.println("N = " + N);
            N--;
        }
    }
    
    public void Uzdevums(){        
        System.out.print("Ievadi skaitli : ");
        int sk = ievade.nextInt();
        
        int summa = 0;
        
        for (int i = 1; i <= sk; i++){
            System.out.println(i);
            summa += i;
        }
        System.out.println("Summa = " + summa);
    }
    
    public void Uzdevums2(){
        System.out.print("Ievadi skaitu : ");
        int skaits = ievade.nextInt();      
                
        int summa = 0;
        
        for (int i = 1; i <= skaits; i++){
            System.out.print("Ievadi skaitli : ");
            int sk = ievade.nextInt();
            summa += sk;
        }
        System.out.println("Summa = " + summa);
        System.out.println("Vidējā vērtība : " + (summa / skaits));
    }
    
    public void Uzdevums3(){
        System.out.print("Ievadi skaitli : ");
        int sk = ievade.nextInt();
        
        int rez = 0;
        
        for(int i = 1; i <= sk; i++){
            System.out.println(i + " = " + i * i * i);
        }
        
    }
    
    public void Uzdevums4() {
      System.out.print("Ievadi rindu skaitu : ");
      int rsk = ievade.nextInt();
      
      for (int i = 1; i <= rsk; i++){
          for (int j = 1; j <= i; j++){
              System.out.print("*");
            }  
              System.out.println();
          }          
          
    
    }
    
    public void Uzdevums5() {
        
        System.out.print("Ievadi skaitu : ");
        int skaits = ievade.nextInt();
        
        for (int rinda = 1; rinda <= skaits; rinda++){
            //rinda ir pāra
            if (rinda % 2 == 0){
                for(int i = skaits; i >= 1; i--){
                    System.out.print(i);
                }
                //rinda ir nepāra
            } else {
                //izvada skaitļus augoši
                for(int i = 1; i <= skaits; i++){
                    System.out.print(i);
                }
            }
            //pārejam jaunā rindā
            System.out.println();
        }        
                               
           
    }
    
    public void Uzdevums6() {
        System.out.print("Ievadi skaitli : ");
        int sk = ievade.nextInt();
        
        int sum = 0;            
            while (sk != 0)
            {
                sum = sk % 10;
                sk /= 10; 
                System.out.print(sum);
            }          
       
    }
    
    public void Uzdevums7() {
        System.out.print("Ievadi rindu skaitu : ");
        int rsk = ievade.nextInt();
        
        for (int i = 1; i <= rsk; i++) {
            
        
        for (int j = rsk - i; j >= 1; j--){
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++){
            System.out.print(i * (i - 1) / 2 + k + " ");  
        }
        System.out.println();
    }  
    }
   
}
