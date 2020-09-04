/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.14
        Scanner dato =  new Scanner(System.in);
        
        int numero=0;
        String ca="";
        
        System.out.println("Ingresar Numero:");
        numero=dato.nextInt();
        
        if(numero==10)
        {
            ca="A";
        }else if(numero==9)
        {
            ca="B";
        }else if(numero==8)
        {
            ca="C";
        }else if(numero==7 || numero==6)
        {
            ca="D";
        }else if(numero<=5 && numero>=0)
        {
            ca="E";
        }
        System.out.println("La Calificación es:"+ca);
    }
}
