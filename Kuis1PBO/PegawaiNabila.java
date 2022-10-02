/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1PBO;

/**
 *
 * @author HoR-BNI WMA
 */
public class PegawaiNabila {
    private String nama;
    private String nip;
    private double gajiPokok, lembur, uangMakan, transport;
    private int jumlahJamKerja;
    private double totalGaji;

    public PegawaiNabila (String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }



    public void setJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }
    
    public void hitungGajiHarian(){
        this.gajiPokok = jumlahJamKerja*2000;

        if(jumlahJamKerja > 7 ){
            this.lembur = (jumlahJamKerja-7)*1.5*2000;
            this.uangMakan = 3500;
        }else{
            this.lembur = 0;
            this.uangMakan = 0;
        }

        if(jumlahJamKerja >= 8){
            this.uangMakan = 3500;
        } else{
             this.uangMakan = 0;
         }

        if(jumlahJamKerja >= 9){
            this.transport = 4000;
        }else{
            this.transport = 0;
        }

        this.totalGaji = gajiPokok+lembur+uangMakan+transport;
    }
    public void cetakPenghasilan(){
        this.hitungGajiHarian();
        System.out.println("_______________________________________________");
        System.out.println("Nama\t\t\t: "+this.nama);
        System.out.println("NIP\t\t\t: "+this.nip);
        System.out.println("Jumlah Jam Kerja\t: "+this.jumlahJamKerja+" Jam");
        System.out.println("Gaji Pokok\t\t: "+this.gajiPokok);
        System.out.println("Uang Lembur\t\t: "+this.lembur);
        System.out.println("Uang Makan\t\t: "+this.uangMakan);
        System.out.println("Uang Transport\t\t: "+this.transport);
        System.out.println("Total Gaji\t\t: "+this.totalGaji);

    }


}
