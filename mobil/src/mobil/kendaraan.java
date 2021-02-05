/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;
import java.util.Scanner;
        ;
/**
 *
 * @author ASUS
 */
public class kendaraan {
    
    static void spek(){
        String jenis, merk, brand, warna;
        int cc, tahun;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("##SPEK KENDARAAN##");
        System.out.print("jenis : ");
        jenis = input.nextLine();
        System.out.print("merk : ");
        merk = input.nextLine();
        System.out.print("brand : ");
        brand = input.nextLine();
        System.out.print("warna : ");
        warna = input.nextLine();
        System.out.print("cc : ");
        cc = input.nextInt();
        System.out.print("tahun : ");
        tahun = input.nextInt();
        
        System.out.println("##SPEK KENDARAAN##");
        System.out.println("jenis : "+jenis);
        System.out.println("merk : "+merk);
        System.out.println("brand : "+brand);
        System.out.println("warna : "+warna);
        System.out.println("cc : "+cc);
        System.out.println("tahun : "+tahun);
        
    }
}
