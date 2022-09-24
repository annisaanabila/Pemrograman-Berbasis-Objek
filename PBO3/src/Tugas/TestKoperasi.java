/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author HoR-BNI WMA
 */
public class TestKoperasi {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

        Anggota a1 = new Anggota("111333444","Donny", 5000000);

        System.out.println("Nama Anggota\t\t: "+ a1.getNama());
        System.out.println("Limit Peminjaman\t: "+ a1.getlimitPeminjaman());

        System.out.print("\nJumlah uang yang dipinjam: ");
        int pinjam = input.nextInt();
        a1.pinjam(pinjam);
        System.out.println("Total pinjaman saat ini: " + a1.getjumlahPinjaman());
        System.out.print("\nJumlah angsuran:");
        int ang1 = input.nextInt();
        a1.angsur(ang1);
        System.out.println("Total pinjaman saat ini : " + a1.getjumlahPinjaman());

    }
}
