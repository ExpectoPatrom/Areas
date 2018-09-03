/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;
import java.util.Scanner;
import areas.circulo;
import areas.calcularArea;
/**
 *
 * @author Estudiantes
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese un numero para calcular el area de la figura respectiva: 1. Circulo. 2.Cuadrado o rectangulo. 3.Triangulo");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                circulo Circulo = new circulo();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        }
    }

    public Areas() {
    }
    
}
