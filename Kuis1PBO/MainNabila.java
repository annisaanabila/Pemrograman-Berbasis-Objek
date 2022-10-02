/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1PBO;
/**
 *
 * @author HoR-BNI WMA
 */
public class MainNabila {
       public static void main(String[]args){
        PegawaiNabila p = new PegawaiNabila("Annisa", "2016789254");
        p.setJamKerja(7);

        PegawaiNabila p2 = new PegawaiNabila("Nabila", "2156789023");
        p2.setJamKerja(8);

        PegawaiNabila p3 = new PegawaiNabila ("Putri", "1976456789");
        p3.setJamKerja(9);

        PegawaiNabila p4 = new PegawaiNabila ("Azzahra", "1952189012");
        p4.setJamKerja(10);

        System.out.println("");
        System.out.println("================ SYSTEM PENGGAJIAN ================");
        System.out.println("===================== PT. XYZ =====================");
        p.cetakPenghasilan();
        p2.cetakPenghasilan();
        p3.cetakPenghasilan();
        p4.cetakPenghasilan();
    }
   
}
