/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_banka;

/**
 *
 * @author Toms
 */
public class Konts {
    /*Klients klients;    
    char valuta;
    int kontaAtlikums; */
    public double balance;
    
    // Balance 0.00
    public Konts () {
        balance = 0.0;
    }
    //Deposit
    public void deposit (double amount) {
        if (amount <= 10000 && amount > 0){
        balance = balance + amount;
        System.out.println("Operācija veiksmīgi izpildīta " + " , " + "Konta atlikums " + balance);
        } else {
            System.err.println("Nepareiza summa!!!");
        }
    }
    //Withdraw
    public void withdraw (double amount) {
        if (amount <= 500 && amount > 0){
        balance = balance - amount;
        System.out.println("Operācija veiksmīgi izpildīta " + " , " + "Konta atlikums " + balance);
        } else {
            System.err.println("Nepietiek līdzekļu vai nepareiza summa!!!");
        }
    }
    //get ballance
    public double getbalance() {
        return balance;
    }
    }
               
    
