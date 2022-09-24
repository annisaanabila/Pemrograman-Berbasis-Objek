/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author HoR-BNI WMA
 */
public class EncapTest {
    public static void main(String args[]){
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        EncapDemo encap3 = new EncapDemo();

        encap1.setName("Annisa Nabila");
        encap1.setAge(19);

        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
        System.out.println("------------------------");

        encap2.setName("Azzahra Ashyla");
        encap2.setAge(15);
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
        System.out.println("------------------------");

        encap3.setName("Nabila Annisa");
        encap3.setAge(37);
        System.out.println("Name : " + encap3.getName());
        System.out.println("Age : " + encap3.getAge());
        System.out.println("------------------------");
    }
}
