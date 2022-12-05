/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;
import java.util.Scanner;

/**
 *
 * @author Ramadhan Bagus AN
 * *TI-A
 */
public class MainEnergi extends Kinetic {
    
    
    public static void main(String[] args) {
        
        MainEnergi me = new MainEnergi();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan benda = ");
        Double v = input.nextDouble();
        me.setKecepatanBenda(v);
        System.out.println();
        
        System.out.print("Masukkan massa benda  = ");
        Double m = input.nextDouble();
        me.setMassaBenda(m);
        System.out.println();
        
        Double ek = 0.5 * me.getMassaBenda() * me.kecepatanBenda * me.getKecepatanBenda();
        me.setEk(ek);
        
        
        System.out.println( "Jadi Hasilnya adalah " + me.getEk() + " Joule");
        
        
        
    }
}