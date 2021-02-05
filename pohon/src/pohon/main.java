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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Pohon P = new Pohon();
        
               
        for (int a=1;a<=2;a++){
            P.setNama();
            P.seTinggi();
            System.out.println("======================");
        }
        for (int a=1;a<=2;a++){
            System.out.println(P.nama);
            System.out.println(P.tinggi);
               
        }
    }
    
}
