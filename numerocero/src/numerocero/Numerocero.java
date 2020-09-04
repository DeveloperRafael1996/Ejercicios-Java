/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocero;

import java.util.Scanner;

/**
 *
 * @author ESCORPIO
 */
public class Numerocero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 4.3
        Scanner dato= new Scanner(System.in);
        int numero = 0;
        int n=0;
        int cont=0;
        int con=0;
        int conta=0;
        System.out.println("Ingresar Cantidad de Numeros:");
        numero=dato.nextInt();
        for(int i=0;i<numero;i++)
        {
            System.out.println("Ingresar n°:"+i);
            n=dato.nextInt();
            
            if(n==0)
            {
                cont++;
            }else if(n<0)
            {
                conta++;
            }else if(n>0)
            {
                con++;
            }
        }
        System.out.println("Cuantos son Iguales a Cero:"+cont);
        System.out.println("Cuantos son Menores a Cero:"+conta);
        System.out.println("Cuantos son Mayores a Cero:"+con);
    }
}
