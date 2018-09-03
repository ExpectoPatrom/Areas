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
public class cuadroRectangulo extends calcularArea{

    double medida2;
    public cuadroRectangulo(double medida1) {
        super(medida1);
    }
    
    public static double formulaArea(double medida1, double medida2){
        return medida1*medida2;
    }
}
