package com.mycompany.ejercicio_21_p1;
import java.util.Scanner;

public class Ejercicio_21_p1 {

    public static void main(String[] args) {
        //entradas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese valor del lado 1 del traingulo: ");
        double l1= scanner.nextDouble();
        System.out.print("Ingrese valor del lado 2 del traingulo: ");
        double l2= scanner.nextDouble();
        System.out.print("Ingrese valor del lado 3 del traingulo: ");
        double l3= scanner.nextDouble();      
        
        //proceso
        double p= (l1+l2+l3);
        double sp= p/2;
        double area= Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
        
        //salida
        System.out.println("El perimetro del traingulo es: " +p);
        System.out.println("El semiperimetro del traingulo es: " +sp);
        System.out.println("El area del traingulo es: " +area);
        
        scanner.close();
    }
}
