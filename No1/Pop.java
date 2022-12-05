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
public class Pop{
    
    String penyanyi = "Raisa";
    String lagu = "Kali Kedua";
    
    public Pop(){
        
    }
    
    public Pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
}