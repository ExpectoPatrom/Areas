/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;
import java.util.Scanner;
import areas.circulo;
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
                System.out.println("Ingrese el radio del circulo");
                double radio,pi1;
                pi1 = 3.1416;
                radio = sc.nextDouble();
                circulo Circulo = new circulo(radio,pi1);
                System.out.println(circulo.formulaArea(radio, pi1));
                break;
            case 2:
                System.out.println("Ingrese el valor de la base");
                double base, altura;
                base = sc.nextDouble();
                System.out.println("Altura");
                altura = sc.nextDouble();
                cuadroRectangulo cuadro = new cuadroRectangulo(base, altura);
                System.out.println(cuadroRectangulo.formulaArea(base, altura));
                break;
            case 3:
                System.out.println("Ingrese la altura");
                double alturat, baset;
                alturat = sc.nextDouble();
                System.out.println("Ingrese la base");
                baset = sc.nextDouble();
                triangulo Triangulo = new triangulo(alturat,baset);
                System.out.println(triangulo.formulaArea(alturat,baset));
                break;
        }
    }
    
}
