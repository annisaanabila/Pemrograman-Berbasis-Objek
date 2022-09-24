/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author HoR-BNI WMA
 */
public class Anggota {
    private String noKtp;
    private String nama;
    private int  limitPeminjaman;
    private int jumlahPinjaman;
    String Pinjam;

    public Anggota(String noKtp, String nama,int limitPeminjaman){
       this.noKtp = noKtp;
       this.nama = nama;
       this.limitPeminjaman = limitPeminjaman;
    }

    public String getNama(){
       return nama;
    }
    public int getlimitPeminjaman(){
       return limitPeminjaman;
    }
    public int getjumlahPinjaman(){
       return jumlahPinjaman;
    }
    public void pinjam(int jumlahPinjaman){
       if(jumlahPinjaman > limitPeminjaman){
       System.out.println("Maaf, Jumlah Peminjaman Melebihi Limit");
    }else{
        this.jumlahPinjaman = jumlahPinjaman;
    } 
}   
    public void angsur(int angsuran){
        if(angsuran<=(jumlahPinjaman*10/100)){
            System.out.println("Maaf, Angsuran harus diatas 10% dari jumlah pinjaman");
        }else{

        this.jumlahPinjaman =(jumlahPinjaman - angsuran);
    }
}
}