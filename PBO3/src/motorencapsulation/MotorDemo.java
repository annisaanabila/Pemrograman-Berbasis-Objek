/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author HoR-BNI WMA
 */
public class MotorDemo {
    public static void main(String[] args){
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();
 
        motor.setKecepatan(110);
        motor.printStatus();

        motor.setKecepatan(80);
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
