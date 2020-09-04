/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablademultiplicar;

import java.util.Scanner;



public class Tablademultiplicar {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 4.17
      Scanner dato= new Scanner(System.in);
      int mul=0;
      int num=0;
      System.out.println("Ingresar La Tabla Del N°:");
      num=dato.nextInt();
      for(int i=1;i<=12;i++)
      {
          mul=num*i;
          System.out.println(num+"x"+i+"="+mul);
      }
    }
}
