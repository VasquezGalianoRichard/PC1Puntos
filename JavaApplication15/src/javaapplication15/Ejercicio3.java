/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double soles;
        int opcion;
        double resultado;
        String moneda;
        System.out.println("Ingrese la cantidad en Soles(PEN)");
        soles=lector.nextDouble();
        System.out.println("Seleccione el tipo de moneda a convertir");
        System.out.println("1.Dolares ");
        System.out.println("2.Euros");
        System.out.println("3.Libras Esterlinas");
        System.out.println("4.Pesos mexicacnos");
        
        System.out.println("Seleccione una opción");
        opcion=lector.nextInt();
        
        switch(opcion){
            case 1:
                resultado= soles*0.27;
                moneda="USD";
                break;
            case 2:
                resultado= soles*0.25;
                moneda="EUR";
                break;
            case 3:
                resultado= soles*0.21;
                moneda="GBP";
                break;
            case 4:
                resultado=soles*4.50;
                moneda="MXN";
                break;
            default:
                System.out.println("Moneda no disponible");
                return;
                        
        }   
        System.out.printf("Resultado: %.2f Soles equivalen a %.2f %s",soles,resultado,moneda);
        
    }
}
