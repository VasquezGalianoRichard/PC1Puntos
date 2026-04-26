/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Richard
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner lector=new Scanner (System.in);
       double pension,promedio,descuento,bono;
       int respuesta;
       System.out.println("Ingrese la pension");
       pension=lector.nextDouble();
       System.out.println("Ingrese su promedio");
       promedio=lector.nextDouble();
       System.out.println("Pagara al contado 1.Si/2.No");
       respuesta=lector.nextInt();
       if (promedio>=18&&promedio<20){
           descuento=pension*0.20;
           
       }else{
           if(promedio>=15&&promedio<=17.99){
               descuento=pension*0.10;
               
           }else{
               if (promedio>=13&&promedio<=14.99){
                   descuento=pension*0.05;
               }else{
                   descuento=0;
               }
           }
        }
       if (respuesta==1){
           bono=50;
       }else{
           bono=0;
       }
       double montofinal=pension-bono-descuento;
        System.out.println("Desglose de matricula");
        System.out.println("Pension Base=S/"+pension);
        System.out.println("Descuento por promedio=S/"+descuento);
        System.out.println("Bono de pago al contado=S/"+bono);
        System.out.println("Monto final a pagar=S/"+montofinal);
       
    }
} 
