/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menor;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edad=0;
        String nombre="";
        String resultado="";
        
        for(int i=1;i<3;i++)
        {
            System.out.println("Igresar Persona n°:"+i);
            System.out.println("Ingresar Nombre:");
            nombre=teclado.nextLine();
            System.out.println("Ingresar Edad:");
            edad=teclado.nextInt();
            
            /*if(edad<18)
            {
                resultado="menor";
            }*/
        }
        System.out.println("Mostrar:"+edad);
        System.out.println(nombre);
    }
}
