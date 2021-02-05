/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaranpersegi;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("PILIH SALAH SATU : (LINGKARAN/PERSEGI)");
        System.out.print("PILIH = ");
        String pilih = input.next();
        
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();
        
        if(pilih.equalsIgnoreCase("lingkaran")){
            l.hitung();
        }
        else{
            p.hitung();
        }
    }
    
}
