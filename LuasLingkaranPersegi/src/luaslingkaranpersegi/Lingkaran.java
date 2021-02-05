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
public class Lingkaran {
    
    double luas;
    int r;
    
    void hitung(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Masukan Nilai Yang Diketahui");
        System.out.print("r = ");
        r = input.nextInt();
        
        luas = (22/7)*r*r;
        System.out.println("hasilnya = "+luas);
    }
    
}
