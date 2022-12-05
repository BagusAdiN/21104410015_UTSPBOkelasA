/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package No1;

/**
 *
 * @author Ramadhan Bagus AN
 * TI-A
 */
public class Dangdut {
    
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    public void Dangdut(){
        
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu, String kopi_Dangdut){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
}