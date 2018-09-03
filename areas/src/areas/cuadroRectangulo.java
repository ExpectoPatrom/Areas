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
public class cuadroRectangulo extends Areas{
    double medida1;
    double medida2;
    cuadroRectangulo(double base, double altura){
        medida1 = base;
        medida2 = altura;
    }
    public static double formulaArea(double medida1, double medida2){
        return medida1*medida2;
    }
}
