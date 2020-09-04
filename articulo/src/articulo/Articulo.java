/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Articulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.6
        Scanner teclado =  new Scanner(System.in);
        
        int costo=0;
        double desc=0;
        double total=0;
        
        System.out.println("Ingresar Costo:");
        costo=teclado.nextInt();
        
        if(costo>=200)
        {
            desc=0.15;
        }else if(costo>=100 && costo<200)
        {
            desc=0.12;
        }else if(costo<100)
        {
            desc=0.10;
        }
        total=costo - desc;
        
        System.out.println("Costo:"+costo);
        System.out.println("Descuento:"+desc);
        System.out.println("Total a Pagar:"+total);
    }
    
}
