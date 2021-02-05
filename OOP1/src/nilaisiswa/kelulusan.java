/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author ASUS
 */
public class kelulusan {
     public static void main(String[] args) {
         siswa s =new siswa();
         
         s.nama = "Anya";
         s.nilai = 80;
         
         s.cetaknilai();
         
         if (s.lulus()){
             System.out.println("selamat anda lulus");
         }
         else if (s.tidaklulus()){
             System.out.println("anda harus belajar lebih giat lagi");
         }
     }
}
