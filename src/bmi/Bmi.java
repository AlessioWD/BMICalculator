/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Toshiba
 */
public class Bmi {
    double bmi;  
    
    void getBmi(double beratbadan, double tinggibadan){
        double tinggipermeter = tinggibadan / 100;
        bmi = beratbadan / (tinggipermeter * tinggipermeter);
        
        System.out.println("BMI Anda: " +bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurang Berat Badan");
        } else if (bmi < 30.9) {
            System.out.println("Kategori: Berat Badan Normal");
        } else if (bmi < 29.9) {
            System.out.println("Kategori: Kelebihan Berat Badan");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
