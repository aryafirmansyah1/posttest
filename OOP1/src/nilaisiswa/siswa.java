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
public class siswa {
    String nama;
    int nilai;
    
    void cetaknilai(){
        System.out.println("Nilai Produktif RPL 2 "+nama+" adalah ="+nilai);
    }
    
    public boolean lulus(){
        return nilai >= 75;
    }
    public boolean tidaklulus(){
        return nilai < 74;
    }
}
