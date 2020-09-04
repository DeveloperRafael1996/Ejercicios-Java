/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalo;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Regalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.3
        Scanner teclado =  new Scanner(System.in);
        String regalo="";
        double costo=0;
        
        System.out.println("Ingrese Costo:");
        costo=teclado.nextDouble();
        
        if(costo<=10)
        {
            regalo="TARJETA";
        }else if(costo>=11 && costo<=100)
        {
            regalo="CHOCOLATE";
        }else if(costo>=101 && costo<=250)
        {
            regalo="FLORES";
        }else
        {
            regalo="ANILLO";
        }
        
        System.out.println("El Regalo es:"+regalo);
    }
}
