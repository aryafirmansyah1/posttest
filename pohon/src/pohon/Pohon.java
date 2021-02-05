/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohon;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Pohon {
    
    String nama;
    int tinggi;
    
    Scanner input = new Scanner (System.in); 
    void setNama(){
        System.out.print("nama pohon : ");
        nama = input.nextLine();
    }
    void seTinggi(){
        System.out.print("Tinggi pohon : ");
        tinggi = input.nextInt();
    }
    
    String NM(){
        return nama;
    }
    int TG(){
        return tinggi;
    }
    
   
    
}
