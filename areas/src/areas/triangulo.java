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
public class triangulo extends Areas{
  
    double  medida2;
    double medida1;
    
     public static double formulaArea(double medida1,double medida2){
       return (medida1*medida2)/2;
    }

    public triangulo(double medida2, double medida1) {
        this.medida2 = medida2;
        this.medida1 = medida1;
    }
   
}
