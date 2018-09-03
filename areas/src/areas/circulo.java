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
public class circulo extends calcularArea{
    
    final double PI = 3.1416;
    
    public circulo(double medida1) {
        super(medida1);
    }
    public static double formulaArea(double medida1, double PI){
        return PI*(medida1*medida1);
    }

    circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
