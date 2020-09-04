/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;
import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.13
        Scanner teclado = new Scanner(System.in);
        
        int alumno=0;
        double costo=0;
        
        System.out.println("Ingresae Cantidad de Alumnos:");
        alumno=teclado.nextInt();
        
        if(alumno>100)
        {
            costo=20;
        }else if(alumno>=50 && alumno<=100)
        {
            costo=35;
        }else if(alumno>=20 && alumno<=49)
        {
            costo=40;
        }else if(alumno<20)
        {
            costo=70;
        }
        System.out.println("El Costo Por Alumno es:"+costo);   
    }
}
