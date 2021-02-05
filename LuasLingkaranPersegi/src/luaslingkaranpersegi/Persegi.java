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
public class Persegi {
    
    double luas;
    int s;
    
    void hitung(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Masukan Nilai Yang Diketahui");
        System.out.print("s = ");
        s = input.nextInt();
        
        luas = s*s;
        System.out.println("hasilnya = "+luas);
    }
}
