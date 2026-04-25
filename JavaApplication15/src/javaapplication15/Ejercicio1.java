/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;


/**
 *
 * @author Richard
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int h0,m0,s0,h,m,s;
        System.out.println("Ingrese las horas");
        h0=lector.nextInt();
        System.out.println("Ingrese los minutos");
        m0=lector.nextInt();
        System.out.println("Ingrese los segundos");
        s0=lector.nextInt();
        if (h0>23||h0<0||m0>59||m0<0||s0>59||s0<0){
            System.out.println("Valores no permitidas");
        }else{
            h=h0;
            m=m0;
            s=s0;
            s=s+1;
            if (s==60){
                s=0;
                m=m+1;
                if (m==60){
                    m=0;
                    h=h+1;
                    if (h==24){
                        h=0;   
                    }       
                }
            } 
            System.out.printf("Entrada: %02d:%02d:%02d -> Salida: %02d:%02d:%02d\n",h0,m0,s0,h,m,s);
        }        
    } 
}
