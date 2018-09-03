/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author Estudiantes
 */
public class circulo extends Areas{
    double medida1;
    double PI;
    public circulo(double radio, double pi1){
         medida1 = radio;
         PI = pi1;
    }
    
    public static double formulaArea(double medida1, double PI){
        return PI*(medida1*medida1);
    }

}
