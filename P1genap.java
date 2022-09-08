/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPBO;

/**
 *
 * @author HoR-BNI WMA
 */
public class P1genap {
    public static void main(String[] args){


        String bil[] = {"2", "1", "4", "1", "7", "6", "2", "0", "1", "6"};
        
        int i = 1;
        do{
            int j=i;
            do {
                System.out.print(" ");
                j++;
            }while (j <= (bil.length-1));
            int k = 0;
            do {
                System.out.print(bil[i-1]);
                k++;
            }while (k <= (i*2) - 2);
            System.out.println("");
            i++;
        }while (i <= bil.length);
    }

}

