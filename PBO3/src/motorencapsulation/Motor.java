/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author HoR-BNI WMA
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontak0n = false;
    public void nyalakanMesin(){
        kontak0n = true;
    }
    public void matikanMesin(){
        kontak0n = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
       if (kontak0n == true){
       kecepatan += 5;
        }
        else{
            System.out.println("kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontak0n == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena Mesin 0ff! \n");
        }
    }
    
    public void printStatus(){
        if (kontak0n == true){
            System.out.println("Kontak 0n");
        }
        else{
            System.out.println("Kontak 0ff");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
 
// pertanyaan no 3
    public void setKecepatan(int kecepatan){
        if(!this.kontak0n && kecepatan > 0){
             System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }else{
            if(kecepatan > 100 || kecepatan < 0){
            System.out.println("Kecepatan Melebihi Batas Maksimal 100 KM");
            System.out.println("----------------------------------------");
        }else{
            this.kecepatan = kecepatan;
            System.out.println("----------------------------------------");
        }
    }
}
}
