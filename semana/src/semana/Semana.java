/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 3.15
        Scanner dato= new Scanner(System.in);
       int n=0;
       String dia="";
       
        System.out.println("Ingresar Numero:");
        n=dato.nextInt();
        
        switch(n){
            case 1:
                dia="LUNES";
                break;
            case 2:
                dia="MARTES";
                break;
            case 3:
                dia="MIERCOLES";
                break;
            case 4:
                dia="JUEVES";
                break;
            case 5:
                dia="VIERNES";
                break;
            case 6:
                dia="SABADO";
                break;
            case 7:
                dia="DOMINGO";
                break;
        }
        System.out.println("El Dia es:"+dia);
    }
}
