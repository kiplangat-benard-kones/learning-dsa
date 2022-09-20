/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

/**
 *
 * @author bkones
 */
public class TimeDuration {

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(5000);
            long duration = System.currentTimeMillis() - start;
            System.out.println("Response time (ms):" + duration);
            
            String field127 = "Derrick##Ankunda#SEETA HIGH SCHOOL (GREEN)#S2C - Senior Two C";
            
            String[] sc = field127.split("#");
            String classi = sc[sc.length-1];
            System.out.println("" + classi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
