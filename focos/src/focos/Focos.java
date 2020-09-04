/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focos;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Focos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 4.4
        Scanner dato =  new Scanner(System.in);
        
        int con=0;
        int cont=0;
        int conta=0;
        int focos=0;
        String  color="";
        
        System.out.println("Ingresar Cantidad de Focos:");
        focos=dato.nextInt();
        for(int i=1;i<=focos;i++)
        {
            System.out.println("Ingresar Color:"+i); 
            color=dato.next();
            switch(color){
                case "rojo":
                    con++;
                    break;
                case"blanco":
                    cont++;
                    break;
                case"verde":
                    conta++;
                    break;
            }
        }
        System.out.println("Cantidad de Blancos:"+cont);
        System.out.println("Cantidad de Rojos:"+con);
        System.out.println("Cantidad de Verdes:"+conta);
    }
}
